package com.downcasting;
class Demo{
	void play() {
		System.out.println("Playing Criket");
	}
}
class Sample extends Demo{
    void play() {	
	System.out.println("Playing Hockey");
}
}
class School extends Sample{
	void play() {
		System.out.println("Playing ");
	}
}
public class MainProgram {
public static void main(String[] args) {
	Demo ref=new Sample();
	Sample a1=(Sample)ref;//casting statement 
	a1.play();
	
}
}
