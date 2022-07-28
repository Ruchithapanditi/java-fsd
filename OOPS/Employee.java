package com;

public class Employee {
	int empID;
	String name;
	float salary;
	public int getEmpID() {
		return empID;
	}
   public String getName() {
		return name;
	}
   public float getSalary() {
		return salary;
	}
   public Employee(int empID, String name, float salary) {
		super();
		this.empID = empID;
		this.name = name;
		this.salary = salary;
	}
   @Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", salary=" + salary + "]";
	}
  public static void main(String[] args) {
		Employee emp1=new Employee(1, "Ruchi", 2200);
		System.out.println("Employee Details:"+emp1.toString());
		

	}

}
