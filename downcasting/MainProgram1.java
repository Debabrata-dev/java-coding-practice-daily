package com.downcasting;
class Car{
	void ride() {
		System.out.println("Without parrameter");
	}
	void ride(int a) {
		System.out.println("With parameter");
	}
	void ride(int a,int b) {
		System.out.println("with parameter 2");
	}
}
public class MainProgram1 {
public static void main(String[] args) {
Car c1=new Car();
c1.ride();
c1.ride(5);
c1.ride(9, 90);
}
}
///Method overloading is the concept of multiplemethod in a class with the same name and different arrgument list24 dec
///We can vary the arrgument by type of arrgument, length of arrgument, sequence of arrgument 
//when we overloading it is amnadatory to pass argument
///it is useto perform compiletime polymurphishim
//Method overloading is use to perfrom sametask with different way .