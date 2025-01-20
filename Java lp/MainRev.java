import java.util.Scanner;

public class MainRev {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int num=s1.nextInt();
        int rev=0;
        while (num!=0) {
          int on=num%10;
          rev=rev*10+on;
          num=num/10;
        }
        System.out.println(rev);
    }
}
