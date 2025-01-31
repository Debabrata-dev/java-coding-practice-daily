package com.collecton;

import java.util.ArrayList;

class College{
	int age=90;
	double per=20;
	String name="Demo";
	public College(int age,double per,String name) {
		this.age=age;
		this.per=per;
		this.name=name;
	}
	@Override
	public String toString() {
		return "["+age+","+per+","+name+"]";
	}
}
public class MyArrayList {
public static void main(String[] args) {
	ArrayList<College> a1=new ArrayList<College>();
	a1.add(new College(45,20,"Demo"));
	a1.add(new College(42, 30, "Sample"));
	a1.add(new College(35,10,"Demo1"));
	a1.add(new College(32, 40, "Sample1"));
	a1.add(new College(55,50,"KKAR"));
	a1.add(new College(52, 60, "SRK"));
	
	for(College c1:a1) {
	  if(c1.per>30) {
		  System.out.println(c1);
	  }
	}
}
}
