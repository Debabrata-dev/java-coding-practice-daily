package com.collecton;
import java.util.ArrayList;
class Student{
	int id;
	String name;
	double percentage;
	public Student(int id,String name,double percentage){
		this.id=id;
		this.name=name;
		this.percentage=percentage;
	}
	@Override

	public String toString() {
		return "["+id+","+name+","+percentage+"]";
	}
}
public class MainArray1 {
public static void main(String[] args) {
	
	Student s1=new Student(1,"virat",20);
	Student s2=new Student(2,"Rohit",60);
	Student s3=new Student(3,"HardiK",30);
	Student s4=new Student(4,"jaswal",70);
	Student s5=new Student(5,"Jhon",30);
	Student s6=new Student(6,"Roman",70);
	ArrayList<Student> a1=new ArrayList<Student>();
	
	a1.add(s1);
	a1.add(s2);
	a1.add(s3);
	a1.add(s4);
	a1.add(s5);
	a1.add(s6);
//	for(int i=0;i<a1.size();i++) {
//		if(a1.get(i).percentage>60) {
//			System.out.println(a1.get(i));
//		}
//	}
	
	for(Student st:a1) {
		if(st.percentage>60) {
			System.out.println(st);
		}
	}
	
}
}
