package com.this_super;
class Alpha{
	int x=10;
}
class Bita extends Alpha{
	int x=20;
	void play(int x) {
		 x=30;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}
}
public class MainSuper {
public static void main(String[] args) {
	Bita b1=new Bita();
	b1.play(2);
}
}
