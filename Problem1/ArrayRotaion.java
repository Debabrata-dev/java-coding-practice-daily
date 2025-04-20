package Problem1;

public class ArrayRotaion {
	static void rotate(int[] arr,int k) {
		int n=arr.length;
		k=k%n;
		int[] ans=new int[n];
		int j=0;
		for(int i=n-k;i<n;i++) {
			ans[j++]=arr[i];
		}
		for(int i=0;i<n-k;i++) {
			ans[j++]=arr[i];
		}
		
		for(int a=0;a<ans.length;a++) {
			System.out.println(ans[a]);
		}
	}
	public static void main(String[] args) {
		int k=2;
		int[] arr= {1,2,3,4,5,6};
rotate(arr, k);
	}
}
