package com;
class A1 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("process i="+i);
		}
	}
}
class B1 extends Thread{
	public void run() {
		for(int j=0;j<5;j++) {
			System.out.println("Process j="+j);
		}
	}
}

public class Mythreads {

	public static void main(String[] args) {
		A1 a1=new A1();
		B1 b1=new B1();
		a1.start();
		b1.start();

	}

}
