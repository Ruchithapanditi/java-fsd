package pack1;

public class Accessmodifier{
		void displaydef() {
			System.out.println("You are using default acess specifier");
		}
		@SuppressWarnings("unused")
		private void displaypri(){
			System.out.println("You are using private acess specifier");
		}
		public void displaypub() {
			System.out.println("You are using public specifier");
		}
		protected void display() 
	    { 
	        System.out.println("This is protected access specifier"); 
	    } 

	public static void main(String[] args ) {
		Accessmodifier d=new Accessmodifier();
		System.out.println("Default Access Modifier");
		d.displaydef();
		System.out.println("Private Access Modifier");
		Accessmodifier pri=new Accessmodifier();
		pri.displaypri();
		
	}
	}
