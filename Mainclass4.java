package com.jspider.encapsulation;

public class Mainclass4 {
public static void main(String[] args) {
	Connection c=Connection.getConnection();
	Connection c1=Connection.getConnection();
	Connection c2=Connection.getConnection();
	System.out.println(c);
	System.out.println(c1);
	System.out.println(c2);
}
}
