package com.collecton;

import java.util.ArrayList;

public class MainArray2 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList(10);
	a1.add(10);
	a1.add(20);
	a1.add(30);
	a1.add(40);
	a1.add(50);
	a1.add(60);
	a1.add(70);
	a1.add(80);
	a1.add(90);
	a1.add(100);
	a1.set(2,69);
	a1.remove(8);

//	for(Object ele:a1) {//we do down casting because 
//  int a=(int)ele;
//  if(a>=50) {
//	  System.out.println(a);
//  }
//}
	int i=0;
	for(Object ele:a1) {
		int a=(int)ele;
		
		i+=a;
		
	}
	System.out.println(i);
	
    
}
}
