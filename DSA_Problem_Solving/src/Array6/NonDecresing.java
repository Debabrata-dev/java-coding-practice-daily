package Array6;

public class NonDecresing {
static int[] SortSquared(int[] arr) {
	int n=arr.length;
	int left=0;
	int right=n-1;
	int[] ans=new int[n];
	int k=0;
	while(left<=right) {
		if(Math.abs(arr[left])>Math.abs(arr[right])) {
			ans[k++]=arr[left]*arr[left];
			left++;
		}
		else {
			ans[k++]=arr[right]*arr[right];
			right--;
		}
	}
	return ans;
}
	public static void main(String[] args) {
		int arr[]= {-10,8,-2,1,4,5,-3};
		int[] ans=SortSquared(arr);
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}
	}

}
