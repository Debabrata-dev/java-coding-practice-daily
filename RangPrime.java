import java.util.Scanner;
public class RangPrime {
   public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int num=s.nextInt();
    int count=0;
    if(num>1 && num<=25){
        for(int i=1;i<=num;i++){
          if(num%i==0){
            count++;
          }
        }
        if(count==2){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a prime number");
        }
    }
    
    else{
        System.out.println("Not a prime number");
    }


   } 
}
