package com;
class MyException extends Exception {
	public MyException() {
	
	}
	public MyException(String msg) {
		super(msg);                      // passing this message to Exception parameter constructor to set the message. 
	}
}

public class CostumExceptionDemo {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		try {
				if(a>b) {
					//throw new MyException();						// custom exception 
			     	throw new MyException("a>b");           // custom exception with custom message
				}
				else {
					System.out.println("No exception");
				}
		}
			catch(Exception e)
			{
				System.out.println(e);
			}

	}

}

