package Problem1;

public class ArrSecMaxMin {
static int secMax(int[] arr) {
	int max1;
	int max2;
	
	if(arr[0]>arr[1]) {
		max1=arr[0];
		max2=arr[1];
	}
	else {
		max1=arr[1];
		max2=arr[0];
	}
	for(int i=0;i<arr.length;i++) {
		if(max1<arr[i]) {
			max2=max1;
			max1=arr[i];
}
		else if(max2<arr[i] && arr[i]<max1) {
			max2=arr[i];
		}
		}
	return max2;
}
	public static void main(String[] args) {
int[] arr= {1,2,7,3,4,6,5,2};
System.out.println(secMax(arr));
	}

}
