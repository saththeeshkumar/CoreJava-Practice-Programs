package collections;

import java.util.LinkedList;

public class ListLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList al = new LinkedList();
		al.add('a');
		al.add('b');
		al.add('z');
		al.add('c');
		al.add('f');
		al.add('d');
		System.out.println(al);
		al.add(3, "abcd");
		al.add(true);
		System.out.println(al);
		System.out.println(al.contains("abcd"));
		System.out.println(al.indexOf('f'));
		System.out.println(al.get(4));
		al.remove(3);
		System.out.println(al);
		//al.clear();
		//System.out.println(al);
		//System.out.println(al.isEmpty());
		
		LinkedList al2 = new LinkedList();
		al2.addAll(al);
		System.out.println(al2);
		
		LinkedList al3 = new LinkedList();
		al3.add(10);
		al3.add(20);
		System.out.println(al3);
		al3.addAll(1, al);
		System.out.println(al3);
		al3.retainAll(al);
		System.out.println(al3);
		



	}

}
