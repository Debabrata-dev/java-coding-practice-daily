package com.collecton;

import java.util.ArrayList;

public class MyArray3 {
public static void main(String[] args) {
	ArrayList<Integer> a1=new ArrayList<Integer>();
	a1.add(90);
	a1.add(80);
	a1.add(70);
	a1.add(60);
	a1.add(50);
	a1.add(40);
	a1.add(30);
	a1.add(20);
	a1.add(10);
	a1.add(110);
	for(int i=0;i<a1.size();i++) {
	
		if(a1.get(i)>60) {
			System.out.println(a1.get(i));
		}
	}
}
}
