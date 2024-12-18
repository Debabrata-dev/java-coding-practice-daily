import java.util.Scanner;
public class NthPrime {
    public static void main(String[] args) {
        Scanner s2=new Scanner(System.in);
        System.out.println("Enter how many number till you find prime number");
        int num=s2.nextInt();
        int count=0;
        for(int i=1;i<=num;i++){
         if(num%i==0){
          count++;
         }
        if(count==2){
            System.out.println(i);
        }
        }
    }
}
