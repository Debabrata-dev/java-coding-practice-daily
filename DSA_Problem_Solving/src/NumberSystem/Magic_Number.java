package NumberSystem;

public class Magic_Number {
    static boolean isMagicNumber(int num) {
    	int sum=0;
    	while(num>9) {
while(num>0) {
	int temp=num%10;
	sum+=temp;
	num=num/10;
}
num=sum;
sum=0;
}
return num==1;
    }

    public static void main(String[] args) {
        int num = 199;
        System.out.println(isMagicNumber(num)); // true
    }
}