import java.util.Scanner;
public class UnitReverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int s1=s.nextInt();
        int revers=0;
        while(s1>0){
           revers=revers*10+s1%10;
           s1/=10;
        }
     System.out.println(revers);
    }
}
