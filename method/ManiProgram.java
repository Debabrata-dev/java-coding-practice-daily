package com.method;
class Car{
	void vechil() {
      System.out.println("car ridding");
	}
}
class Bike extends Car{
	@Override
	void vechil() {
	System.out.println("Bike riding");	
	}
}
class Cycle extends Car{
	@Override
	void vechil() {
		System.out.println("cycle riding");
	}
}
public class ManiProgram {
public static void main(String[] args) {
	Car c1=new Cycle();
	c1.vechil();
	
}
}
