package Problem_Solving;

public class ArrEvenOdd {
 static void swap(int[] arr,int i,int j) { 
	 int temp=arr[i];
	 arr[i]=arr[j];
	 arr[j]=temp;
 }
 static void OddEven(int[] arr) {
	int left=0;
	int right=arr.length-1;
	while(left<=right) {
		if(arr[left]%2!=0&&arr[right]%2==0) {
			swap(arr, right, left);
			right++;
			left--;
		}
		if(arr[left]%2==0) {
			left++;
		}
		if(arr[right]%2!=0) {
			right--;
		}
	}
 }
	public static void main(String[] args) {
int[] arr= {12,23,21,9,10,11,8,6,33};
OddEven(arr);
for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]);
}
	}

}
