package Problem_Solving;

import java.util.Scanner;

public class PrefixSum {
static int[] sum(int[] arr) {
	int n=arr.length;
	int[] pref=new int[n];
	pref[0]=arr[0];
	for(int i=1;i<arr.length;i++) {
		pref[i]=pref[i-1]+arr[i];
	}
	return pref;
}


	public static void main(String[] args) {
  int[] arr= {0,2,4,1,3,6,5};
 int n=arr.length;
 int[] ans=sum(arr);
Scanner s1=new Scanner(System.in);
System.out.println("Enter Number of Query");
int q=s1.nextInt();
while(q-->0) {
	System.out.println("Enter range");
	int l=s1.nextInt();
	int r=s1.nextInt();
	int a1=ans[r]-ans[l-1];
	System.out.println(a1);
}
	}

}
