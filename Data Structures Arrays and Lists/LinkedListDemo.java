package com;
import java.util.*;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(0, 5); //adding using index
		ll.add(1, 3);
		ll.add(2, 7);
		ll.add(3, 1);
		ll.add(4, 10);
		ll.add(5, 9);
		System.out.println( "Given Linked List:"+ll);
		ll.remove(2);
		System.out.println("Linked list after removing element in index  2 :"+ll);
		ll.remove();
		System.out.println("After removing Head element:"+ll);
		ll.removeFirst();
		System.out.println("After removing First Element:"+ll);
		ll.removeLast();
		System.out.println("After removing Last Element:"+ll);
		
	}

}
