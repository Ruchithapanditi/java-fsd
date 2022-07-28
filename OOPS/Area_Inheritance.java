package com;

class Area{
	int x,y;
	public void calculatearea(int x,int y)
	{
	}
}
class Triangle extends Area{
	int length,breadth;
	public void calculatearea(int length,int breadth) {
		double area=0.5*length*breadth;
		System.out.println("Area of Traingle:"+area);
	}
}
class Rectangle extends Area{
	int l,b;
	public void calculatearea(int l,int b) {
		int res=l*b;
		System.out.println("Area of Rectangle:"+res);
	}
}

public class Area_Inheritance {
 
	public static void main(String[] args) {
	  Triangle tr=new Triangle();
	  tr.calculatearea(4, 7);
	  Rectangle rt=new Rectangle();
	  rt.calculatearea(5, 6);

	}

}
