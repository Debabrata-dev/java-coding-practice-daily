import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        int res=1;
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int p=s.nextInt();
  for(int i=1;i<=p;i++){
    res=num*res;
  }
  System.out.println(res);
    }
}
