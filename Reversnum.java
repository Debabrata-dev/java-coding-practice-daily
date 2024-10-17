import java.util.Scanner;
public class Reversnum {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int s1=s.nextInt(); 
       int ans=0;
       while(s1>0){
        ans=ans*10+s1%10;
        s1/=10;
       }
       System.out.println(ans);
    }
}
