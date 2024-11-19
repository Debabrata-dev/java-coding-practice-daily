//256314->2+5+6+3+1+4->21->3

import java.util.Scanner;

public class Mainclass {
    static int sumOfDigits(int n){
        int rem=0,sum=0;
        while(n!=0){
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        return sum;
    }
   public static void main(String[] args) {
  Scanner ip=new Scanner(System.in);
  int n=ip.nextInt();
  while(n>9){
    n=sumOfDigits(n);
  }
  System.out.println(n);
   } 
}
