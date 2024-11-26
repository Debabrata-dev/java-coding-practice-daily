import java.util.Scanner;

public class MainArmstrong1 {
    public static void main(String[] args) {
        int n,arm=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int c=n;
        int rem;
        while(n!=0){
          rem=n%10;
        arm=(rem*rem*rem)+arm;
          n=n/10;
        }
        if(arm==c){
            System.out.println("ArmStrong Number");
        }
        else{
            System.out.println("This is not Armstrong");
        }
    }
}
