import java.util.Scanner;

public class MainProgram{
 public static void main(String[] args) {
    Scanner s1=new Scanner(System.in);
    double radious=s1.nextDouble();
    double area=Math.PI*radious*radious;
    System.out.println("Area of th e circle"+area);
 }
}