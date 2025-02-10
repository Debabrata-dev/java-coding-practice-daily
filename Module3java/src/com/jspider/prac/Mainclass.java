package com.jspider.prac;
class Student1{
	String name="Debabrata";
}
class Student2 {
	String name="Debabrata";
	@Override
	public String toString() {
		return "Student name: "+name;
	}
}
public class Mainclass {
public static void main(String[] args) {
	Student1 s=new Student1();
	System.out.println(s);
	Student2 s1=new Student2();
	
	System.out.println(s1);
}
}
