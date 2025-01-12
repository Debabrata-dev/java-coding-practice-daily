//imp throws

import java.util.Scanner;

public class MainProgram{
    public void connect() throws ArithmeticException{
        Scanner s=new Scanner(System.in);
      int a=s.nextInt();
        int b=s.nextInt();
        int c=a/b;//riskey code
        System.out.println(c);
    }
    public static void main(String[] args) {
         MainProgram m1=new MainProgram();
         try{
         m1.connect();
         }
         catch(ArithmeticException e){
       System.err.println("Error");
         }
         finally{
            System.out.println("main method end");
         }
    }
}