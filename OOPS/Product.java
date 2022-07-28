package com;

public class Product {
	public int Product(int x,int y) {
		return x*y;
	}
	public double Product(double a,double b) {
		return a*b;
	}
	public int Product(int x,int y,int z) {
		return x*y*z;
	}

	public static void main(String[] args) {
		Product pp=new Product();
	   int res1=pp.Product(2, 4);
	   double res2=pp.Product(2.5, 1.5);
	   int res3=pp.Product(5, 3, 7);
	   System.out.println("Result1: "+res1);
	   System.out.println("Result2: "+res2);
	   System.out.println("Result3: "+res3);

	}
	
	}

