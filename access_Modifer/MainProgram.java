package com.access_Modifer;
class Demo{
	
	private String name;
	private String age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
}
public class MainProgram {
public static void main(String[] args) {
	Demo d1=new Demo();
    d1.setAge("78");
    d1.setName("varun");
    System.out.println(d1.getAge());
    System.out.println(d1.getName());
}
}
//Private memeber can be access in the same class only