import java.util.Scanner;
public class MainNeon {
    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int num=s.nextInt();
     int seq=num*num;
     int sum=0;
     int temp;
     while(seq!=0){
     temp=seq%10;
     sum+=temp;
     seq=seq/10;
     }  
     if(sum==num){
        System.out.println("It is a neon number");
     } 
     else{
        System.out.println("Not a Neon umber");
     }
    }
}
