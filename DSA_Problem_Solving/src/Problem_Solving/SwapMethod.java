package Problem_Solving;

public class SwapMethod {
public static void swap(int a,int b) {
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a+" "+b);
}
static int[] reverseArray(int[] arr) {
	int n=arr.length;
	int[] ans=new int[n];
	int j=0;
	for(int i=n-1;i>=0;i--) {
	ans[j++]=arr[i];
	}
	return ans;
}
	public static void main(String[] args) {
int a=9;
int b=3;
int[] arr= {1,2,3,4,5};
int[] ans=reverseArray(arr);
for(int i=0;i<ans.length;i++) {
	System.out.println(ans[i]);
}
	}

}
//swap wit out using temp variable