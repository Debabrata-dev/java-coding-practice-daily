package com.jspders.ClassAndObject;
class Student1{
	int name=1234;
}
class Student2 {
	int name=1234;
	@Override
	public String toString() {
		return "Student name: "+name;
	}
}

public class TostringMainClass {
	
	
	public static void main(String[] args) {
		Student1 s1=new Student1();
		System.out.println(s1);
		Student2 s2=new Student2();
		
		System.out.println(s1);
	}
}


