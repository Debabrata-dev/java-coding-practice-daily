package Problem1;

public class MainProgram {
	static void reversArray(int[] arr) {
		int n=arr.length;
		int j=0;
		int[] ans=new int[n];
		for(int i=n-1;i>=0;i--) {
			ans[j++]=arr[i];
		}
		for(int a=0;a<ans.length;a++) {
			System.out.print(ans[a]);
			
		}
		 
	}
	public static void main(String[] args) {
     int[] arr= {1,2,3,4,5};
   reversArray(arr);
	}
}
