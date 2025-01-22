package com.Javabean;
 class BankAccount{
private long accoutnumber;
private int amount;

public long getAccoutnumber() {
	return accoutnumber;
}
public void setAccoutnumber(long accoutnumber) {
	this.accoutnumber = accoutnumber;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
}
public class MainProgram {
public static void main(String[] args) {
	BankAccount a1=new BankAccount();
	a1.setAccoutnumber(894824);
	System.out.println(a1.getAccoutnumber());
	a1.setAmount(8394);
	System.out.println(a1.getAmount());
}
}
