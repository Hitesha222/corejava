package collectionPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList {
	public static void main(String[] args) {
//			program to demonstrate use of ArrayList class in collection

		Collection<Integer> arr= new ArrayList<>();
//		ArrayList<Integer> arr = new ArrayList<>();
		arr.add((int) 100.00);
		arr.add((int) 45.98);
		((ArrayList<Integer>) arr).addFirst(999);
		arr.add(00);
		arr.add(77);
		System.out.println(arr);
		arr.removeIf(n->n%2==0);
		System.out.println(arr);
		System.out.println(arr.size());
//		Collections.sort(arr);

		Iterator<Integer> i = arr.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
//		while (i.hasPrevious()) {
//			System.out.println(i.previous());
//		}
		List<Integer> l = new ArrayList<>();
		l.add(900);
		l.add(32009);
		l.add(87385);
		l.add(67);
		l.replaceAll(n -> n-1);

		arr.addAll(l);
		
		System.out.println(l);
		System.out.println("--------------");
		l.remove(3);
		System.out.println(arr.removeAll(l));
		System.out.println(arr);
		arr.clear();
		System.out.println(arr);
		

	}

}
