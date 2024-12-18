import java.util.Scanner;
public class MainPositive {
public static void main(String[] args) {
    Scanner s1=new Scanner(System.in);
    System.out.println("Enter Number");
    int num=s1.nextInt(); 
    if(num>0){
        System.out.println("Positive Number");
    }    
    else if(num==0){
        System.out.println("It is Zero");
    }
    else{
        System.out.println("Nagative Number");
    }
    }
}