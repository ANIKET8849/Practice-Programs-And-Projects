package java_Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortList {

	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<>();
		list.add("xyz");
		list.add("dfg");
		list.add("abc");
		list.add("pqr");
		list.add("sqp");
		
		
		Collections.sort(list);
		System.out.println(list);
		

	}

}
