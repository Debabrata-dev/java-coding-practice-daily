class InvalidAgeExcption extends Exception{

}
class Voting{
    static int age=13;
    static void verifyage(int age) throws InvalidAgeExcption{
            
             if(age<18){
                throw new InvalidAgeExcption();
             }
             else{
                System.out.println("you welcome");
             }
    }
}
public class MainThrow1 {
    public static void main(String[] args) throws InvalidAgeExcption {
Voting.verifyage(5);


    }
}
