package NumberSysytem;

import java.util.Scanner;

public class FactRecurison {
static int fact=1;
	public static void main(String[] args) {
 Scanner s1=new Scanner(System.in);
		int no=s1.nextInt();
 FactRecurison.calFact(no);
	System.out.println(fact);	
	}
static void calFact(int no) {
	
	if(no>=1) {
		 fact=fact*no;
		calFact(no-1);
	}
	
}
}
//Factorial