package Problem_Solving;

public class HGFProgram {
	static int hcf(int num) {
		int hfg=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				hfg=i;
			}
		}
		return hfg;
	}
public static void main(String[] args) {
	int num=34;
	System.out.println(hcf(num));
}
}
