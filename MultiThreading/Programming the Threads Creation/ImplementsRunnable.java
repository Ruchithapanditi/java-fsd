package com;
class Exa1 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("process i="+i);
		}
	}
}
class Exa2 implements Runnable{
	public void run() {
		for(int j=0;j<5;j++) {
			System.out.println("Process j="+j);
		}
	}
}

public class ImplementsRunnable {

	public static void main(String[] args) {
		Exa1 a1=new Exa1();
		Exa2 b1=new Exa2();
		Thread t1=new Thread(a1);
		Thread t2=new Thread(b1);
		t1.start();
		t2.start();

	}

}
