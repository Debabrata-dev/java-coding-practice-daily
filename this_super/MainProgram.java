package com.this_super;
class Car{
//	void service() {
//		System.out.println(this);
//	}
	
	static int num=90;
	 void money() {
		System.out.print(this.num);
	}
}
public class MainProgram {
public static void main(String[] args) {
Car c1=new Car();
c1.money();
}
}
