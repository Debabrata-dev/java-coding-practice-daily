package NumberSysytem;

import java.util.Scanner;

public class Factorial {
	static int fact=1;
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	int num=5;
	int a=Factorial.factor(num);
	System.out.println(a);
}
static int factor(int num) {
	if(num>1) {
		fact=fact*num;
		factor(num-1);
	}
	return fact;
}
}
