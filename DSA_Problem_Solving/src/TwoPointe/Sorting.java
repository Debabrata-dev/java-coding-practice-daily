package TwoPointe;

public class Sorting {
	static void swap(int[] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	static void printArray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}   System.out.println();
	}
	
	public static void main(String[] args) {
      int[] arr= {1,0,0,0,0,1,1,1,1};
}
}