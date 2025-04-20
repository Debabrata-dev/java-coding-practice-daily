package Problem1;

import java.util.Scanner;

public class ArraSearching {
	static int[] makeFrequencyArray(int[] arr) {
		int[] freq=new int[1000];
		for(int i=0;i<arr.length;i++) {
			freq[arr[i]]++;
		}
		return freq;
	}
	public static void main(String[] args) {
  int[] arr= {1,2,3,4,5,6};
int[] freq=makeFrequencyArray(arr);
Scanner s1=new Scanner(System.in);
System.out.print("Enter number to be search");
int q=s1.nextInt();
while(q>0) {
	System.out.println("Enter number to be search");
	int x=s1.nextInt();
	if(freq[x]>0) {
		System.out.println("yes");
	}
	else {
		System.out.println("NO");
	}
}
}
}