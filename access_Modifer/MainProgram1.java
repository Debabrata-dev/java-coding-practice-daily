package com.access_Modifer;

class Bank{
	private int Accountnum;
	private double bal;
	public int getAccountnum() {
		return Accountnum;
	}
	public void setAccountnum(int num) {
		this.Accountnum=num;
	}
	public double getbal() {
		return bal;
	}
	public void setbal(double balance) {
		this.bal=balance;
	}
	
}

public class MainProgram1 {
public static void main(String[] args) {
	Bank b1=new Bank();
	b1.setAccountnum(100000);
	b1.setbal(8099.9);
	System.out.println(b1.getAccountnum());
	System.out.println(b1.getbal());
}
}

//To access the private member we must be use getter setter method .
///Tight encapsulation -