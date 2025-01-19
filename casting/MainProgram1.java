package com.casting;
class Animal1{
	int a=90;
	void pay() {
		System.out.println("89 is money");
	}
	void say() {
		System.out.println("i am animal");
	}
}
class Fish1 extends Animal1{
	int b=45;
	void say() {
		System.out.println("i am fish");
	}
}
public class MainProgram1 {
public static void main(String[] args) {
	Animal1 a2=new Fish1();
   Fish1 a1=(Fish1)a2;///Down casting
   System.out.println(a1.b+" "+a1.a);
   a1.say();
	a1.pay();
	Fish1 b1=new Fish1();
	System.out.println(b1.a);
	System.out.println(b1.b);
	b1.say();
}
}
