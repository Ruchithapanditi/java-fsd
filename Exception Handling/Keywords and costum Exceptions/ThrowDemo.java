package com;

public class ThrowDemo {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		try {
				if(a>b) {
					
					throw new ArithmeticException();
					
				}else {
					System.out.println("No");
				}
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println(e);		// internally it will call toString method to display the name of the exception 

	}

}
}
