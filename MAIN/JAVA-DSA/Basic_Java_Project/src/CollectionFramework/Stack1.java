package CollectionFramework;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		Stack<String> list= new Stack<>();
		list.push("Aniket1");
		list.push("Aniket2");
		list.push("Aniket3");
		list.push("Aniket4");
		list.push("Aniket5");
		System.out.println(list);
		list.pop();
		System.out.println(list);
		System.out.println(list.search("Aniket2"));
		list.setSize(12);
		System.out.println(list.size());
		System.out.println(list.indexOf("Aniket3"));
		list.clear();
		System.out.println(list);
	}

}
