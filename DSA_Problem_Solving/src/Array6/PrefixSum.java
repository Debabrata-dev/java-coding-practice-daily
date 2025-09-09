package Array6;

public class PrefixSum {
static void print(int[] arr) {
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
}
static int[] makePrefixSumArr(int[] arr) {
	int n=arr.length;
	int[] ans=new int[n];
	ans[0]=arr[0];
	for(int i=1;i<n;i++) {
		arr[i]=arr[i-1]+arr[i];
	}
	return arr;
}
	public static void main(String[] args) {
int[] arr= {1,2,3,4,5 };
int[] ans=makePrefixSumArr(arr);
print(ans);

	}

}
