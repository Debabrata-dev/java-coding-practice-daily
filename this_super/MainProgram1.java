package com.this_super;

class Student{
      int roll=23;
	void test() {
		int roll=89;
		System.out.println(this.roll);
		System.out.println(roll);
	}
}


public class MainProgram1 {
public static void main(String[] args) {
	Student s1=new Student();
	s1.test();
}
}
