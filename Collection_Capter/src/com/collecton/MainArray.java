package com.collecton;
import java.util.ArrayList;
class pen{
	String brand="Cello";
	String price="45";
	String color="blue";
	String type="ball";
	public String toString() {
		return "["+brand+","+price+","+color+","+type+"]";
	}
}
public class MainArray {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(12);
	a1.add(new pen());
	a1.add("Demo");
	a1.add("Money");
	a1.add("power");
	a1.add("Strnth");
	System.out.println(a1);
	for(Object element:a1) {
		if(element instanceof String) {
			System.out.println(element);
		}
	}
}
}

///array size increase 60%s
