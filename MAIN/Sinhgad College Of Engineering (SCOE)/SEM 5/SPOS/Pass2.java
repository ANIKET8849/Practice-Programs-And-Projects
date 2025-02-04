import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Pass2 {

    List<ST> st;
	List<LT> lt;
	int LC, BR;
	int[] BT = new int[16];
	String input;
	PrintWriter output;

	public static void main(String[] args) throws Exception {

		Pass2 p2 = new Pass2();
		p2.init(); // initialization
		p2.pass2();

	}

	public void init() throws Exception {
		LC = 0; // initialize location counter to 0
		for (int i = 0; i < 16; i++) // Initialize Base table all entries to -1
		{
			BT[i] = -1;
		}
		// Set Symbol Table
		st = new LinkedList<ST>();
		File f = new File("Sym_tab.txt"); // set file handle to input file
		Scanner sym_tab = new Scanner(f); // canner object to read input file
		while (sym_tab.hasNextLine()) {
			String ST_token[] = sym_tab.nextLine().split(" ");
			st.add(new ST(ST_token[0], Integer.parseInt(ST_token[1]), Integer
					.parseInt(ST_token[2]), ST_token[3].charAt(0)));
		}

		// Set Literal Table
		lt = new LinkedList<LT>();
		File f1 = new File("Lit_tab.txt"); // set file handle to input file
		Scanner lit_tab = new Scanner(f1); // canner object to read input file
		while (lit_tab.hasNextLine()) {
			String LT_token[] = lit_tab.nextLine().split(" ");
			lt.add(new LT(LT_token[0], Integer.parseInt(LT_token[1]), Integer
					.parseInt(LT_token[2]), LT_token[3].charAt(0)));
		}

	}

	public void pass2() throws Exception {
		File f = new File("op.txt"); // set file handle to input file
		Scanner sc = new Scanner(f); // canner object to read input file
		output = new PrintWriter(new FileOutputStream("final_op.txt"));
		while (sc.hasNextLine()) // to read all lines one by one
		{
			input = sc.nextLine(); // read line from input file
			String token[] = input.split(" "); // divide line to words separated
												// by space
			//System.out.println(input);
			if (Search_POT(token) == false)// call SearchPOT to check											// availability of PseudoCode
			{    
				if (Search_MOT(token) == false) {
					
					if (token.length > 0 && token[1].startsWith("="))
					{	output.println(LC + " " + token[1]);
					    output.flush();
					    LC=LC+4;
					}
					else {
						output.println(token[0]);
					    output.flush();
				}
				}
			}
		}

		// Display All tables
		String op = new String();
		int i;
		System.out.println("Symbol Table:");
		System.out.println("Symbol    A/Value  Length   R/A");
		 for(i=0;i<st.size();i++)
		 {   ST obj=st.get(i);
			 System.out.println(obj.Sym_name+"  "+obj.addr+"     "+obj.leng+"     "+obj.rel);
		 }
		System.out.println("\nLiteral Table:");
		System.out.println("Literal   Value  Length   R/A");
		for(i=0;i<lt.size();i++)
		 {   LT obj=lt.get(i);
			 System.out.println(obj.lit_name+"    "+obj.addr+"     "+obj.leng+"     "+obj.rel);
		 }
	}

	public boolean Search_POT(String tk[]) throws Exception {
		File pot = new File("POT.txt"); // open POT file
		Scanner read_pot = new Scanner(pot); // Scanner object to read POT file
		int pos = 1;
		if (tk.length == 4) // if label exists
			pos = 2;
		while (read_pot.hasNextLine()) {
			String pot_line = read_pot.nextLine();
			// String pot_tk[]=pot_line.split(" ");
			if (pot_line.equalsIgnoreCase(tk[pos])) // compare word at given
													// position in i/p with POT
													// line
			{
				if (tk[pos].equalsIgnoreCase("START")) {
					// System.out.println("START found");
					LC = Integer.parseInt(tk[pos + 1]);
					output.println(LC + " ");
					output.flush();
					return true;
				} else if (tk[pos].equalsIgnoreCase("USING")) {
					//Set up Base Table
					String op[] = tk[pos + 1].split(",");
					BR = Integer.parseInt(op[1]);
					if (op[0].equals("*"))
						BT[BR] = LC;
					else
						BT[BR] = Integer.parseInt(op[0]);
					return true;
				} else if (tk[pos].equalsIgnoreCase("END")) {
					output.println(LC);
					output.flush();

					return true;
				} else if (tk[pos].equalsIgnoreCase("LTORG")) {
					System.out.println("LTORG found");
					output.println(LC + " ");
					output.flush();
					while (LC % 8 != 0)
						LC++;

					return true;
				} else if (tk[pos].equalsIgnoreCase("DC")) {
					ST obj;
					// System.out.println("DC found");
					int l = 0, ind = 0;
					if ((ind = Search_ST(tk[pos - 1])) > -1) {
						obj = st.get(ind);
						l = obj.leng;
						String val = tk[pos + 1].substring(tk[pos + 1].indexOf("'"), tk[pos + 1].length());
						output.println(LC + " " + val);
						output.flush();
						LC = LC + l;
					} else
						System.out.println("Symbol not found"); // adding label
																// to Symbol
																// Table
					return true;
				} else if (tk[pos].equalsIgnoreCase("DS")) {
					ST obj;
					// System.out.println("DC found");
					int l = 0, ind = 0;
					if ((ind = Search_ST(tk[pos - 1])) > -1) {
						obj = st.get(ind);
						l = obj.leng;
						output.println(LC + " ---Reserved---");
						output.flush();
						LC = LC + l;
					} else
						System.out.println("Symbol not found"); // adding label
																// to Symbol
																// Table
					return true;
				} else {
					System.out.println("Error no Pseudocode found");
				}
			}
		}
		return false; // if Pseudo code not exists in input line
	}

	public int Search_ST(String name) {
		ST st_obj;
		for (int i = 0; i < st.size(); i++) // search ST
		{
			st_obj = st.get(i);
			if (st_obj.Sym_name.equals(name)) // duplicate found
			{
				return i;
			}
		}
		return (-1);
	}

	public boolean Search_MOT(String tk[]) throws Exception {
		int Len = 0, offset = 0;
		ST obj;
		LT obj1;
		String hex_code, format;
		File mot = new File("MOT.txt"); // open POT file
		Scanner read_mot = new Scanner(mot); // Scanner object to read MOT file
		int pos = 1;
		if (tk.length == 4) // if label exists
			pos = 2;
		
		while (read_mot.hasNextLine()) {
			int ind = 0;
			String mot_line = read_mot.nextLine();

			String mot_w[] = mot_line.split(" ");
			
			if (tk[pos].equalsIgnoreCase(mot_w[0])) {
				output.print(LC + " ");
				Len = Integer.parseInt(mot_w[2]);
				format = mot_w[3];
				hex_code = mot_w[1];
				String op[] = tk[pos + 1].split(","); // separate operands
				// based on comma
				if (format.equalsIgnoreCase("RX")) {
					// Process 2nd operand
					
					if ((ind = op[1].indexOf("$")) >= 0) {
					   // System.out.println(Integer.parseInt(op[1].substring(ind + 1,op[1].length())));
						obj = st.get(Integer.parseInt(op[1].substring(ind + 1,op[1].length())));
						System.out.println("here"+op[1].length());
						offset = obj.addr - BT[BR];
						
					}
					
					if ((ind = op[1].indexOf("@")) >= 0) {// START HERE
						obj1 = lt.get(Integer.parseInt(op[1].substring(ind + 1,
								op[1].length())));
						offset = obj1.addr - BT[BR];
					}

					input = " ";
					input = hex_code + " " + op[0] + "," + offset + "(" + BR
							+ ",0)";
					output.println(input);
					output.flush();
				}
				else{
					input = " ";
					input = hex_code + " " + op[0] + "," + op[1];
					output.println(input);
					output.flush();
				}
				LC = LC + Len;
				
				return true;
			}
		}
		
		return false;
	}
	
}