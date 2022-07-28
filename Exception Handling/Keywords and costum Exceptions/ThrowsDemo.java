package com;

public class ThrowsDemo {
	static void display1() throws Exception{
		try {
		int a=10/0;
		throw new Exception();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("display1 method");
	}
	
	static void display2() throws Exception{
		try {
		display1();
		}catch(Exception e) {}
		System.out.println("display2 method");
		
	}

	public static void main(String[] args) {
		try {
				display2();
				}catch(Exception e) {}
				System.out.println("This is main method");

	}

}
