package com.jspider.program;

public class MainProgram {
public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=i;j>=1;j++) {
			if(i+j>=n+1)
			System.out.print("*");
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
