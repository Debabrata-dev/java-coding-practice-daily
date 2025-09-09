package Problem_Solving;

public class ArrayRotate {
public static int[] rotateInPlace(int[] arr,int k) {
	int n=arr.length;	
	k=k%n;
	int[] ans=new int[n];
	int j=0;
	for(int i=n-k;i<arr.length;i++) {
		ans[j++]=arr[i];
	}
	for(int i=0;i<n-k;i++) {
		ans[j++]=arr[i];
	}
	return arr;
}
	public static void main(String[] args) {
int[] arr= {1,2,3,4,5,6,7};
int k=1;
int  ans[]=rotateInPlace(arr, k);
for(int i=0;i<arr.length;i++) {
	System.out.println(ans[i]);
}
	}

}
