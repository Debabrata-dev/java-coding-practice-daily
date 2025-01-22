package com.casting;
class Flying{
	int b=78;
	void mySound() {
		System.out.println("Chik chak");
	}
}
class Bird extends Flying{
	int a=68;
	void mySound() {
		System.out.println("Chik chak1");
	}
}
class honeybee extends Flying{
	int a=58;
	void mySound() {
		System.out.println("Chik chak2");
	}
}
public class MainProgram5 {
public static void main(String[] args) {
	Flying b1=new Bird();
	b1.mySound();
	//System.out.println(b1.a);
	
}
}
