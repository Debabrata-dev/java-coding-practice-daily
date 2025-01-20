import java.util.Scanner;

public class MainPower1 {
    public static void main(String[] args) {
        int n,p,result=1;
        System.out.println("Enter no");
    Scanner s1=new Scanner(System.in);
      n=s1.nextInt();
    System.out.println("Enter the power");
    p=s1.nextInt();
    for(int i=1;i<=p;i++){
        result=result*n;
    }
    System.out.println(result);
    }
}
