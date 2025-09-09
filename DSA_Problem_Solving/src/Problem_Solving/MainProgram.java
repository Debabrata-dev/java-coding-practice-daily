package Problem_Solving;

public class MainProgram {
public static int[] swap(int[] arr,int a,int b) {
	int n=a;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==a) {
			arr[i]=b;
		}
		else if(arr[i]==b) {
			arr[i]=a;
		}
	}
	return arr;
}
public static void main(String[] args) {
int[] arr= {1,2,3,3,4,5,6};
int a=arr[0];
int b=arr[5];
int[] ans=swap(arr,a,b);
for(int i=0;i<ans.length;i++) {
	System.out.println(ans[i]);
}
}
}

