import java.util.Scanner;

public class MainPower {
public static void main(String[] args) {
  int n,p,res=1;
  System.out.println("enter no");
  Scanner r=new Scanner(System.in);
  n=r.nextInt();
  System.out.println("power");
  p=r.nextInt();
  for(int i=1;i<=p;i++){
    res=n*res;
  }
  System.out.println(res);
    }
}
