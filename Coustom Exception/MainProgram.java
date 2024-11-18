class InvalidAgeException extends Exception{

}
class Votating{
static void voat(int age) throws InvalidAgeException{
if (age<=18) {
    throw new InvalidAgeException();
}
}
}
public class MainProgram {
public static void main(String[] args) {
    try{
        Votating.voat(4);
        System.out.println("give Voat");
    }
    catch(Exception e){
        System.out.println("Invalid age");
    }
}   
}