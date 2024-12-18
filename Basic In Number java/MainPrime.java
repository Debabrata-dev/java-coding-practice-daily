import java.util.Scanner;
public class MainPrime {
    public static void main(String[] args) {
    System.out.println("Enter your number");
    Scanner s1=new Scanner(System.in);
    int num=s1.nextInt();
    int count=0;
    for(int i=1;i<=num;i++){
      if(num%i==0)
        count++;
    }
    if(count==2){
        System.out.println("prime number");
    }
    else{
        System.out.println("Not a prime number");
    }
    }
}
