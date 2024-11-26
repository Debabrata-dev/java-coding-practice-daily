import java.util.Scanner;

public class MainArmStrong {
    public static void main(String[] args) {
        int n,arm=0;
    System.out.println("Enter any Number");
    Scanner s=new Scanner(System.in);
      n=s.nextInt();  
      int c=n;
     while(n>0){
       int rem=n%10;
         arm=(rem*rem*rem)+arm;
         n=n/10;
     }
     if(c==arm){
        System.out.println("ArmStrong");
     }
     else{
        System.out.println("Not ArmStrong");
     }

    }}
