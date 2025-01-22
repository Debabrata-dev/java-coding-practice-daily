package com.method;
class IRCTC{
	void search(String src,String des) {
		System.out.println("train to bbsr");
	}
	void search(int num) {
		System.out.println("train to hatia");
	}
	void search(String pnr) {
		System.out.println("train to sl");
	}
}
public class MainProgram {
public static void main(String[] args) {
	IRCTC s1=new IRCTC();
	s1.search("gvue","gge");
	s1.search(34);
	s1.search("sbgw");
}
}
///