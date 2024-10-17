import java.util.Scanner;
public class Uniti2 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner s=new Scanner(System.in);
        int s1=s.nextInt();
        int sumOfDigit=0;
        while(s1>0){
            sumOfDigit +=s1%10;
            s1=s1/10;
        }
System.out.println(sumOfDigit);

    }
}
