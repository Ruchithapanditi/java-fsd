package com;
import java.util.*;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> ss=new Stack<Integer>();
		ss.push(3);
		ss.push(4);
		ss.push(9);
		ss.push(5);
		ss.push(6);
		System.out.println("After Pushing Elements:"+ss);
		ss.pop();
		System.out.println("After one pop:"+ss);
		ss.pop();
		System.out.println("After second pop:"+ss);
		int x=ss.peek();
		System.out.println("Top value in stack:"+x);
		

	}

}
