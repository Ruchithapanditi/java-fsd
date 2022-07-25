package demo;


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
public static void main(String[] args ) {
	Accessmodifier d=new Accessmodifier();
	System.out.println("Default Access Modifier");
	d.displaydef();
	System.out.println("Private Access Modifier");
	Accessmodifier pri=new Accessmodifier();
	pri.displaypri();
	System.out.println("Public Access Modifier");
	Accessmodifier pub=new Accessmodifier();
	pub.displaypub();
}
}