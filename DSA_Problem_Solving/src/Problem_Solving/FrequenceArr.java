package Problem_Solving;

import java.util.Scanner;

public class FrequenceArr {
	static int[] makeFreqencyArray(int[] arr){
		int[] freq=new int[100];
		for(int i=0;i<arr.length;i++) {
			freq[arr[i]]++;
		}
		return freq;
	}
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,4,3,2,1,12};
	int[] freq=makeFreqencyArray(arr);
    Scanner s1=new Scanner(System.in);
	int q=s1.nextInt();
	while(q>0) {
	System.out.println("Enter the number to be search");
	int x=s1.nextInt();
	if(freq[x]>0) {
		System.out.println("yes");
	}
	else {
		System.out.println("No");
	}
		q--;
	}
}
}
