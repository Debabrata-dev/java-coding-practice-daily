package Array6;

public class MainNon_Decreasing {
static int[] Square(int[] arr) {
	int n=arr.length;
	int[] ans=new int[n];
	int left=0,right=n-1;
	int k=n-1;
	while(left<=right) {
		if(Math.abs(arr[left])>Math.abs(arr[right])) {
			ans[k--]=arr[left]*arr[left];
			left++;
		}
		else {
			ans[k--]=arr[right]*arr[right];
			right--;
		}
	}
	return ans;
}
	public static void main(String[] args) {
int arr[]= {-10,-3,-2,1,4,5};
int ans[]=Square(arr);
for(int i=0;i<ans.length;i++) {
	System.out.println(ans[i]);
}
	}

}
