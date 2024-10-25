//Natural number>1
//Which has only 2 factor 1 and itself

import java.util.Scanner;;
public class Primenumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       int num=s.nextInt();
       int count=0;
       if(num>1){
        for(int i=1;i<=num;i++){
           if(num%i==0)
           count++;
        }
        if(count==2){
            System.out.println("This is Prime Number");
        }
        else{
            System.out.println("This is not a Prime Number");
        }
       }
       else{
        System.out.println("It is not a primeNumber");
       }

    }
}
