package com;

public class TryCatchExample {

	public static void main(String[] args) {
		System.out.println("HI");
		//int a=10,b=0;
		int arr[]= {10,20,30,40,50};
		try {
			//int res=a/b;
			//System.out.println("Result="+res);
			int res1=100/arr[5];
			System.out.println("Rsult="+res1);
		}
		catch(Exception e ){
			System.out.println("I Take Care!");//User defined Exception
			System.out.println(e.getMessage());//Pre-defined exception
			System.out.println(e.toString());//Exception name and message
		}
		System.out.println("BYE!!");

	}

}
