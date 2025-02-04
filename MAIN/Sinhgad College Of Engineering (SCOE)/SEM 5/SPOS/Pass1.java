import java.util.Scanner;
import java.io.*;
import java.util.*;
public class Pass1 {
   
	List<ST> st;
	List<LT> lt;
	int LC;
	String input;
    PrintWriter output;
	public static void main(String[] args) throws Exception{
		Pass1 p1=new Pass1();
        p1.init();  //initialization
        p1.pass1(); //pass1 processing
	}
	
	public void init()
	{
		LC=0; //initialize location counter to 0
		st=new LinkedList <ST>();
		lt=new LinkedList <LT>();
	}
	
	public void pass1() throws Exception
	{
		File f=new File("input.asm");  //set file handle to input file
		Scanner sc=new Scanner(f); //canner object to read input file
		output=new PrintWriter(new FileOutputStream("op.txt"));
		while(sc.hasNextLine())  //to read all lines one by one
		{
			input=sc.nextLine(); //read line from input file
			String token[]=input.split(" "); //divide line to words separated by space
		    if(Search_POT(token)==false)//call SearchPOT to check availability of PseudoCode
		    {
		    	Search_MOT(token);
		    }
		    if(!input.equalsIgnoreCase("LTORG")) {
			output.println(input); //write output to o/p file
			output.flush(); 
		    }
			
		} //end file reading
		//Display All tables
		int i;
		String op=new String();
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
	public boolean Search_POT(String tk[]) throws Exception
	{
		File pot=new File("POT.txt"); //open POT file
		Scanner read_pot=new Scanner(pot); //Scanner object to read POT file
		int pos=0;
		if(tk.length==3)  //if label exists
			pos=1;
		while(read_pot.hasNextLine())
		{
		     String pot_line=read_pot.nextLine();
		     //String pot_tk[]=pot_line.split(" ");
		     if(pot_line.equalsIgnoreCase(tk[pos])) //compare word at given position in i/p with POT line
		     {
		    	 if(tk[pos].equalsIgnoreCase("START"))
		    	 {
		    		 //System.out.println("START found");
		    		 LC=Integer.parseInt(tk[2]);
		    		 st.add(new ST(tk[0],LC,1,'R')); //adding label to Symbol Table
		    		 output.print(LC+" ");
		    		 return true;
		    	 }
		    	 else if(tk[pos].equalsIgnoreCase("USING"))
		    	 {
		    		 //System.out.println("USING found");
		    		 output.print(LC+" ");
		    		 return true;
		    	 }
		    	 else if(tk[pos].equalsIgnoreCase("END"))
		    	 {
		    		 //System.out.println("END found");
		    		 if(!Process_literal(tk))
		    			 output.print(LC+" ");
		    		 return true;
		    	 }
		    	 else if(tk[pos].equalsIgnoreCase("LTORG"))
		    	 {
		    		 //System.out.println("LTORG found");
		    		 Process_literal(tk);
		    		 
		    		 return true;
		    	 }
		    	 else if(tk[pos].equalsIgnoreCase("DC"))
		    	 {
		    		 //System.out.println("DC found");
		    		 int l=0,ind=0;
		    		 if(tk[2].startsWith("F"))
		    			 l=4;
		    		 if(tk[2].startsWith("H"))
		    			 l=2;
		    		 if((ind=Search_ST(tk[0]))>-1)
			    		   st.set(ind,new ST(tk[0],LC,l,'R'));
		    		 else
		    		     st.add(new ST(tk[0],LC,l,'R')); //adding label to Symbol Table
		    		 output.print(LC+" ");
		    		 LC=LC+l;
		    		 return true;
		    	 }
		    	 else if(tk[pos].equalsIgnoreCase("DS"))
		    	 {
		    		 //System.out.println("DS found");
		    		 int l=0,ind=0;
		    		 if((ind=tk[2].indexOf("F"))!=0)
		    		 {
		    			 String s=tk[2].substring(0, ind);
		    			 l=Integer.parseInt(s)*4;
		    		 }
		    		 else if((ind=tk[2].indexOf("H"))!=0)
		    		 {
		    			 String s=tk[2].substring(0, ind);
		    			 l=Integer.parseInt(s)*2;
		    		 }
		    		 if((ind=Search_ST(tk[0]))>-1)
		    		   st.set(ind,new ST(tk[0],LC,l,'R')); //adding label to Symbol Table
		    		 else 
		    			 st.add(new ST(tk[0],LC,l,'R')); //adding label to Symbol Table
		    		 output.print(LC+" "); //write LC to output file
		    		 LC=LC+l; //update LC
		    		 return true;
		    	 }
		    	 else
		    	 {
		    		 System.out.println("Error no Pseudocode found");
		    	 }
		     }
		}
		return false; //if Pseudo code not exists in input line
	}
	public boolean Search_MOT(String tk[]) throws Exception
	{   int Len=0;
	    String format;
		File mot=new File("MOT.txt"); //open POT file
		Scanner read_mot=new Scanner(mot); //Scanner object to read POT file
		int pos=0;
		if(tk.length==3)  //if label exists
			pos=1;
		while(read_mot.hasNextLine())
		{    int ind=0;
		     String mot_line=read_mot.nextLine();
		
		     String mot_w[]= mot_line.split(" ");
		   
		     if(tk[pos].equalsIgnoreCase(mot_w[0]))
		     {     output.print(LC+" ");
		    	   Len=Integer.parseInt(mot_w[2]);
		    	   format=mot_w[3];
		    	   
		    	   if(format.equalsIgnoreCase("RX"))
		    	   {
		    		   //Process 2nd operand
		    		   String op[]=tk[pos+1].split(",");  //separate operands based on comma 
		    		   if(op[1].startsWith("="))
		    		   {  //Literal found add in LT
		    			   lt.add(new LT(op[1],-1,-1,'R'));
		    			   ind=lt.size();
		    			   input=" ";
			    		   input=tk[pos]+" "+op[0]+",@"+ind;
		    		   }
		    		   else
		    		   {    int flag=0;
		    			   //symbol found add in ST (if not duplicate)
		    			   if(Search_ST(op[1])==-1) //Not duplicate
		    			   {
		    			     st.add(new ST(op[1],-1,-1,'R'));
		    			      ind=st.size();
		    			   }
		    			      input=" ";
			    		      input=tk[pos]+" "+op[0]+",$"+ind;
		    		   }
		    		   
		    	   }
		    	   LC=LC+Len;
		    		   
		    	   return true;
		     }
		}
		return false;	     
	}
   public boolean Process_literal(String tk[])
   {    boolean found=false;
	    LT lt_obj;
	    int i=0;
		while(i<lt.size()) {
			lt_obj = lt.get(i);
			if(lt_obj.addr== -1) { //literal found :with no address allocated yet
				
				if(i==0 ) //only for first time
				{   output.println(LC+" "+tk[0]);
				    output.flush();
					while(LC%8 != 0) {  //align literal table origin in multiple of 8
						LC++;
					}
				} //end of if
	
				output.println(LC+" "+lt_obj.lit_name);//write to output file
				output.flush();
				lt.set(i, new LT(lt_obj.lit_name,LC,4,'R'));
				LC=LC+4;
				found=true;
			}
			i++;
		} //end of outer while
	 return found;
	 } //end of Process Literal
   
   public int Search_ST(String name)
   {   
	   ST st_obj;
	   for(int i=0;i<st.size();i++)  //search ST
	   {
		   st_obj=st.get(i);
		   if(st_obj.Sym_name.equals(name)) //duplicate found
			  {  
			   return i;
			  }
	   }
	   return (-1);
   }

}
