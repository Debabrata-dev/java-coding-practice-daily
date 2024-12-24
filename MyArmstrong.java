package org.dailyCodingProblem;
import java.util.Scanner;
public class MyArmstrong {
	static boolean isArmstrong(int n){
		 int temp=n;
		 int digit=0;int sum=0; 
		 while(temp!=0) {
			 temp=temp/10;
			 digit++;
		 }
		 temp=n;
		 while(temp!=0) {
			 int lastdigit=temp%10;
			 sum+=Math.pow(lastdigit,digit);
			 temp=temp/10;
		 }
		 if(n==sum) {
			 return true;
		 }
		 else {
			 return false;
		 }
	}
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=s1.nextInt();
	System.out.println(MyArmstrong.isArmstrong(num));
}
}
