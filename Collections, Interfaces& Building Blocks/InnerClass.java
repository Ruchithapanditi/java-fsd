package demo;
public class InnerClass {
	private String msg1="Hello";
	class Inner1{
		void hello() {
			System.out.println(msg1+" Lets start Inner class");
		}
	}
	private String msg2="Inner Class";
	void display() {
		class Inner2{
			void show(){
				System.out.println(msg2);
			}
		}
	Inner2 I=new Inner2();
	I.show();
	}
	public static void main(String[] args) {
		InnerClass i1=new InnerClass();
		InnerClass.Inner1 in=i1.new Inner1();
		in.hello();
		InnerClass i2=new InnerClass();
		i2.display();
		
		

	}

}
