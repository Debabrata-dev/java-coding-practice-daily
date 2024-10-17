import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int s1=s.nextInt();
        int fact=1;
        for(int i=1;i<=s1;i++){
            fact=fact*i;
         
        }
        System.out.println(fact);
    }
}
