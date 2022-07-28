package com;
abstract class Bikes{
	  abstract void brake();
	}

	class SportsBike extends Bikes {
	  public void brake() {
	    System.out.println("SportsBike Brake");
	  }
	}

	class MountainBike extends Bikes{
	  public void brake() {
	    System.out.println("MountainBike Brake");
	  }
	}
	
class Main{
public static void main(String[] args) {
		 MountainBike m1 = new MountainBike();
		    m1.brake();
		    SportsBike s1 = new SportsBike();
		    s1.brake();

	}

}
