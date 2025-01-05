//Binary to decimal
import java.util.Scanner;
public class Program{
    public static void main(String[] args) {
       
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int pw=1;
      int org;
      int ans=0;
       while (n!=0) {
        org=n%10;
      ans+=(org*pw);
      n=n/10;
      pw*=2;
       }
       System.out.println(ans);
    }
}