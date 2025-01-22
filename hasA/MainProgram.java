package com.hasA;
class Car{
	void MainPrint(String s) {
		System.out.println("Main Print Exception");
	}
	void Ride() {
		System.out.println("Rideing ");
	}
}
class Car1 extends Car{
	Car r1=new Car();
	
}
public class MainProgram {
public static void main(String[] args) {
	Car1 m1=new Car1();
	m1.r1.Ride();
}
}
///it is the concept of one class is act a contenor of another class .
//Has-A relation is 2 type 1-composition 2-Agirgation
///composion is the strong combinatio where the object cannot ext without the container
//1-car has a engine 2-college has a department 3-mobile has a camera

//Aggrigaton is the weakly combination where the contain object can exist 
//car has driver mobile has a cim card .