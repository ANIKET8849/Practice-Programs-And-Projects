package CollectionFramework;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		list.add(20);
		list.add(21);
		list.add(22);
		list.add(23);
		list.add(24);
		System.out.println(list);
		list.addFirst(19);
		list.addLast(25);
		System.out.println(list);
		list.set(3, 28);
		System.out.println(list);
		list.remove();
		System.out.println(list);
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		System.out.println(list.peekLast());
		System.out.println(list.peekFirst());
		System.out.println(list.descendingIterator());
		System.out.println(list.stream());
		System.out.println(list.hashCode());
		System.out.println(list.size());
		System.out.println(list.poll());
		
	}

}
