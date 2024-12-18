import java.util.Scanner;
public class MainLeap {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int year=s1.nextInt();
        if(year%400==0||(year%4==0&&year%100!=0)){
           System.out.println("It is a leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
