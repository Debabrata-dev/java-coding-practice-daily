package com.casting;
class Janvar{
	void makeSound() {
		System.out.println("Bake--");
	}
}
class Dog extends Janvar{
   void makeSound() {	
	System.out.println("BOO BOO BOO");   
   }
}
class Cow extends Janvar{
	void makeSound() {
		System.out.println("Hama Hama Hama");
	}
}

public class MainProgram4 {
public static void main(String[] args) {
	Dog a1=new Dog();
	Janvar a2=new Cow();
	a1.makeSound();
	a2.makeSound();
}
}
///Why we do upcasting