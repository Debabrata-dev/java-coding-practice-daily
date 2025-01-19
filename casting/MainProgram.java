package com.casting;
class Animal{
	String name="Demo";
	void say() {
		System.out.println("Animal");
	}
}
class Fish extends Animal{
	String colour;
	void type() {
		System.out.println("Aquatic animal");
	}
	void say() {
		System.out.println("I am Fish");
	}
}
public class MainProgram {
public static void main(String[] args) {
	Animal a1=new Fish();
    ///it is the object of parent class but it referrs to child class
	a1.say();
}
}

///upcasting  
