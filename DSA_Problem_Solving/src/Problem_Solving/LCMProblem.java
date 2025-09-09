package Problem_Solving;

public class LCMProblem {
static int LCFNumber(int num) {
	int LCM=0;
	for(int i=2;i<num;i++) {
		if(num%i==0) {
			LCM=i;
			break;
		}
	}
	return LCM;
}
	public static void main(String[] args) {
int num=27;
System.out.println(LCFNumber(num));
	}

}
