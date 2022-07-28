package com;
//Encapsulation
public class Account {
	int accno;
	String name;
	float amount;
   public Account(int accno, String name, float amount) {
		super();
		this.accno = accno;
		this.name = name;
		this.amount = amount;
	}
   public Account() {

}
public int getAccno() {
	return accno;
   }
public void setAccno(int accno) {
	this.accno = accno;
     }
public String getName() {
	return name;
  }
public void setName(String name) {
	this.name = name;
  }
public float getAmount() {
	return amount;
  }
public void setAmount(float amount) {
	this.amount = amount;
  }
 @Override
public String toString() {
	return "Account [accno=" + accno + ", name=" + name + ", amount=" + amount + "]";
}

public static void main(String[] args) {
		Account acc1=new Account(1,"Raj",500);
		System.out.println(acc1.toString());
		Account acc2=new Account();
		acc2.setAccno(2);
		acc2.setName("Mahi");
		acc2.setAmount(2000);
		System.out.println("Account 2\n accno:"+acc2.getAccno());
		System.out.println("name="+acc2.getName());
		System.out.println("amount="+acc2.getAmount());

	}

}
