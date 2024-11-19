import java.util.Scanner;

public class StrongNum {
   
       static int factorial(int n){
        int fact=1;
         for(int i=1;i<=n;i++){
            fact=fact*i;
         }
         return fact;
       }
       public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
        int rem=0,sum=0,n1=n;
        while(n!=0){
            rem=n%10;
            sum=sum+factorial(rem);
            n=n/10;
        }
       System.out.println(n1==sum?"Stong No":"Not a Strong Number"); 
    }
}
