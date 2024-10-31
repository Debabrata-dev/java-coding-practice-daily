import java.util.Scanner;
public class GcdHcf {
public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter two number");
  int a=s.nextInt();
  int b=s.nextInt();
  int g=0;
  for(int i=1;i<=a;i++){
    if(a%i==0&&b%i==0){
        g=i;
    }
  }  
  System.out.println(g);
}}