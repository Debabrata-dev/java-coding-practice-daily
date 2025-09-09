package TwoPointe;

public class ArraySorting {
static void printArray(int[] arr) {
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
}
static void swap(int[] arr,int i,int j) {
	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
}
static int[] sortZeroAndOne(int[] arr) {
	int n=arr.length;
	int count=0;
	for(int i=0;i<n;i++) {
		if(arr[i]==0) {
			count++;
		}
	}
	for(int i=0;i<n;i++) {
		if(i<count) {
			arr[i]=0;
		}
		else {
			arr[i]=1;
		}
	}
	return arr;
}
	public static void main(String[] args) {
int[] arr= {1,0,0,0,1,1,0,1,0}; 
int[] ans=sortZeroAndOne(arr);
for(int i=0;i<ans.length;i++) {
	System.out.println(ans[i]);
}
	}

}
