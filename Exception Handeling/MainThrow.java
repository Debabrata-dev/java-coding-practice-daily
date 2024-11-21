//throw
public class MainThrow {
    public static void main(String[] args) {
     int age=12;
     if(age<18){
        throw new ArithmeticException("/ by zero");
     }
     else{
        System.out.println("You are eligibale");
     }

    }
}
