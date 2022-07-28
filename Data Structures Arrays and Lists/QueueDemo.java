package com;
import java.util.*;
public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> qq=new LinkedList<Integer>();
		qq.add(5);
		qq.add(2);
		qq.add(3);
		qq.add(7);
		qq.add(10);
		qq.add(6);
		System.out.println("Queue after adding elements:"+qq);
		qq.remove();
		qq.remove();
		System.out.println("Queue after removing 2 elements:"+qq);

	}

}
