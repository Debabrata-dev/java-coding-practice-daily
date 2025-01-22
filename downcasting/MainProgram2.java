package com.downcasting;
class Wwe{
	void test(int a) {
		System.out.println("Wwe jhon cena");
	}
void test(int a,int b) {
	System.out.println("Wwe Roman Rengen");
	}
void test(String a) {
	System.out.println("Wwe Gold berg");
}
}
public class MainProgram2 {
public static void main(String[] args) {
	Wwe w1=new Wwe();
	w1.test(0);
	w1.test(3);
	w1.test(9,5);
	w1.test("ugs");
}
}
