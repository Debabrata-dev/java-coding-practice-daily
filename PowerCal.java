//Power calculator
//input n=5 power p=3

import java.util.Scanner;

public class PowerCal {
    public static void main(String[] args) {
       int n,p,result=1;
       Scanner r=new Scanner(System.in);
       System.out.println("Enter a Number");
       n=r.nextInt();
       System.out.println("Enter a power number");
       p=r.nextInt(); 

       for(int i=1;i<=p;i++){
        result=n*result;
       }
       System.out.println(result);
    }
}
