package com.programing;

public class SumOdd {
public static void main(String[] args) {
	int num=1234;
	int sum=0;
	while(num>0) {
		int rem=num%10;
		if(rem%2==0)
		{
		sum+=rem;	
		}
		num=num/10;
	}
	System.out.println(sum);
}
}
