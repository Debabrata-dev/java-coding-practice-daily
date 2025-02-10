package com.jspider.warper;
class Demo{
	static void test(Object obj) {
		System.out.println("Kohil");
	}
	static void test(String str) {
		System.out.println("Rohiti");
	}
}
public class Mainclass {
public static void main(String[] args) {
	Demo.test(null);
}
}
