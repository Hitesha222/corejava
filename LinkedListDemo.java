package collectionPractice;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		// LinkedList demo
		LinkedList l1 = new LinkedList();
		l1.add("Deepak");
		l1.add("Anshu");
		l1.add("Amit");
		l1.add("Deepa");
		l1.add("Nirma");
		l1.add(2, "Kanti");
		l1.addFirst(11);
		l1.addLast(2);
		System.out.println(l1);

// 	another object of linkedList
		LinkedList l2 = new LinkedList();
		l2.add(232424);
		l2.add("Anju");
		l2.add("Isha");
		l2.add(2324.24);
		l2.add("Anju");
		l2.offer(34); // INSERTS elemrnts end of the object
		l2.offer(777); // INSERTS elemrnts end of the object
		l2.offer(null); // INSERTS elemrnts end of the object
		l2.offer(null); // INSERTS elemrnts end of the object

		System.out.println(l2.set(2, "e4"));
		System.out.println(l2.get(3));
		System.out.println(l2);

//	add l1 object into l2 object		
		l2.addAll(l1);
		System.out.println(l2);
	}

}
