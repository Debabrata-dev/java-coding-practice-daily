package Array6;

public class RunningSum {
static void PrintArr(int[] arr) {
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
}
static int[] RunningSum(int[] arr) {
    int n=arr.length;	
	int[] ans=new int[n];
	ans[0]=arr[0];
	for(int i=1;i<arr.length;i++) {
		ans[i]=ans[i-1]+arr[i];
	}
	return ans;
}
	public static void main(String[] args) {
int[] arr= {2,1,3,4,5};
int[] ans=RunningSum(arr);
PrintArr(ans);
	}

}
