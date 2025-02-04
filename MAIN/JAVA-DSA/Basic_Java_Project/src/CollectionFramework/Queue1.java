package CollectionFramework;

import java.util.ArrayDeque;

public class Queue1 {

	public static void main(String[] args) {
		ArrayDeque<String> list=new ArrayDeque<>();
		list.addFirst("Aniket1");
		list.addFirst("Aniket2");
		list.addFirst("Aniket3");
		list.addLast("Aniket4");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.remove();
		System.out.println(list);
		System.out.println(list.element());
		System.out.println(list.isEmpty());
		
		for(String a1:list) {
			System.out.println(a1);
		}
		
	}

}
