package CollectionFramework;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("Aniket1");
		list.add("Aniket2");
		list.add("Aniket3");
		list.add("Aniket4");
		list.add("Aniket5");
		
		System.out.println(list);
		list.add(3, "Pranav");
		System.out.println(list);
		
		System.out.println(list.get(2));
		System.out.println(list.indexOf("Aniket4"));
		list.set(1, "Shubh");
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		System.out.println(list.isEmpty()); 
		System.out.println(list.iterator());
		
		list.clear();
		System.out.println(list);
	}
	
}
