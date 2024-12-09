class YoungAgeException extends Exception{

}
class Voting {
    static void vote(int age) throws YoungAgeException{
   if(age<18){
      throw new YoungAgeException();
   }
}
}
public class MainException {
 public static void main(String[] args) {
    try{
   Voting.vote(67);
   System.out.println("Welcome to voter");
    }
    catch(Exception e){
System.out.println("Invilad age");
    }
 }}