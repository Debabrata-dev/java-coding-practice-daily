package Problem_Solving;

public class ArrayReverse {
//static void swap(int[] arr,int i,int j) {
//	int temp=arr[i];
//	arr[i]=arr[j];
//	arr[j]=temp;
//}
	static void printArr(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
static void reverse(int[] arr,int i,int j) {
	while(i<j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
	}
}
static void rotateInPlace(int[] arr,int k) {
	int n=arr.length;
	k=k%n;
	reverse(arr,0,n-1);
	reverse(arr,0,k-1);
	reverse(arr,k,n-1);
}
	public static void main(String[] args) {
int[] arr= {1,2,3,4,5,6};
int k=3;
System.out.println("originl Array");
printArr(arr);
rotateInPlace(arr,k);
System.out.println("Rotated Array");
printArr(arr);
	}
}
