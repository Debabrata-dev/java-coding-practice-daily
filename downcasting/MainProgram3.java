package com.downcasting;
class FaceBook{
	void login() {
		System.out.println("Login");
	}
	void login(int a) {
		System.out.println("12");
	}
	void login(int a,int b) {
		System.out.println("34");
	}
}
public class MainProgram3 {
public static void main(String[] args) {
	FaceBook f1=new FaceBook();
	f1.login();
	f1.login(5);
	f1.login(45,3);
}
}
