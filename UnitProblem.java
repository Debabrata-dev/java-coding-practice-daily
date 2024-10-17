import java.util.Scanner;
public class UnitProblem {
    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter a number");
     int s1=s.nextInt();
     int num=0;
     while(s1>0){
        s1=s1/10;
        num++;
     }
     System.out.println(num);
    }
}
