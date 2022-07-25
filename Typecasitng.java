package demo;

public class Typecasitng {

	public static void main(String[] args) {
		byte a=10;
		short b=a;		//implicit type casting 
		System.out.println("Value of a="+a);
		System.out.println("Value of b="+b);

		short c=10;
		byte d =(byte)c;		// explicit type casting 
        System.out.println("Value of c="+c);
        System.out.println("Value of d="+d);
			
			float x = 100.10f;
			int y = (int)x;			// explicit type casting 	
			System.out.println("Value of x="+x);
			System.out.println("Value of y="+y);


	}

}
