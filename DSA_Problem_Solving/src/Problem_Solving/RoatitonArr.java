package Problem_Solving;

public class RoatitonArr {
static int[] Roate(int[] arr,int k){
	int n=arr.length;
	int[] ans=new int[n];
	k=k%n;
	int j=0;
	for(int i=n-k;i<arr.length;i++) {
		ans[j++]=arr[i];
	}
	for(int i=0;i<n-k;i++) {
		ans[j++]=arr[i];
	}
	return ans;
}
	public static void main(String[] args) {
int[] arr= {1,2,3,4,5,6,7};
int k=1;

int[] ans=Roate(arr, k);
for(int i=0;i<ans.length;i++) {
	System.out.println(ans[i]);
}
	}

}
