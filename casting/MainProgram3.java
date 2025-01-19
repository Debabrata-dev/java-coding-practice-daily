package com.casting;
class Vechil{
	int a=2;
	void play() {
		System.out.println("Parent play()");
	}
}
class Truck extends Vechil{

	int a=3;
	@Override
	void play() {
		System.out.println("child play()");
	}
}
public class MainProgram3 {
public static void main(String[] args) {
	Vechil v1=new Truck();
	System.out.println(v1);
}
}
