package NumberSysytem;

import java.util.Scanner;

public class MainFactorial {
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	int num=s1.nextInt();
	int fact=1;
	for(int i=1;i<=num;i++) { 
		fact=fact*i;
	}
	System.out.println(fact);
}
}
