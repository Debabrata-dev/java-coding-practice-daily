package NumberSysytem;

public class PrimeNumber {
	static boolean Prime(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
			count++;
			}
		}
		return count==2;
	}
public static void main(String[] args) {
	for(int i=1;i<100;i++) {
		
		if(Prime(i)) {
			System.out.println(i);
		}
	}
}
}
