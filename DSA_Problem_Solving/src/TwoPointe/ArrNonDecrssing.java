package TwoPointe;

public class ArrNonDecrssing {
static void print(int[] arr) {
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
}
static int[] sort(int[] arr) {
	int n=arr.length;
	int k=0;
	int ans[]=new int[n];
	int left=0;
	int right=n-1;
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
int[] arr= {-10,-3,-2,2,3,5,6,8};
int ans[]=sort(arr);
print(ans);
	}

}
