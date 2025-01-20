import java.util.Scanner;

public class MainHcf {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        int n1=s1.nextInt();
        int var=0;
        for(int i=1;i<=n1;i++){
            if(n%i==0&&n1%i==0)
            {
               var=i;
            }
          
        }
      System.out.println(var);
    }
}
