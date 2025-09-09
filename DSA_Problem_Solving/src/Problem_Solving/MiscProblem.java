package Problem_Solving;

public class MiscProblem {
 static void swap(int a,int b) {
	int c=b;
	 b=a;
	 a=c;
	 System.out.println(a+" "+b);
 }
	public static void main(String[] args) {
	int a=9;
	int b=3;
	int[] arr= {1,2,3,4,5};
	swap(a,b);
	
	}
}
