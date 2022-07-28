package com;
class Info implements Runnable {
	@Override
	public synchronized void run() {
	Thread t = Thread.currentThread();
	String name = t.getName();
	for(int i =0;i<10;i++) {
		try {
			System.out.println( name+" "+i);
			Thread.sleep(500);
			if(i==5 && name.equals("Priya")) {
				wait();
			}
			
		} catch (Exception e) {}
	}
	}
}

public class SleepandWait {

	public static void main(String[] args) {
		Info obj = new Info();
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		Thread t3 = new Thread(obj);
		t1.setName("Priya");
		t2.setName("Veda");
		t3.setName("Sashi");
		t1.start();
		t2.start();
		t3.start();
		

	}

}
