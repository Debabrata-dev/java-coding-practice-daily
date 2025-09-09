package Problem_Solving;

public class Main {
static int TotlaSum(int[] arr) {
 int totlaSum=0;
 for(int i=0;i<arr.length;i++) {
	 totlaSum+=arr[i];
 }
 return totlaSum;
}
static boolean equalSumPartiton(int[] arr) {
	int totalSum=TotlaSum(arr);
	int prefSum=0;
	for(int i=0;i<arr.length;i++) {
		prefSum+=arr[i];
		int suffixSum=totalSum-prefSum;
		if(prefSum==suffixSum) {
		  return true;
		}
	}
	return false;
}


	public static void main(String[] args) {
int[] arr= {2,3,5,6,3,1};
System.out.println(equalSumPartiton(arr));
	}

}
///2,3,5,6,3,1