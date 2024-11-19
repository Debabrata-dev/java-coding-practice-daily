import java.util.*;
public class MainProgram3 {
    static boolean isPrime(int n){
        int c=n;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }

        }
        return c==2;
    }
         
    public static void main(String[] args) {
      int n=0;
      int c=0;
      for(int i=1;;i++){
        if(isPrime(i)){
            c++;
        }
        if(c==n){
            System.out.println(i); break;
        }
      }
        }
   
    }

