class InvalidPassword extends Exception{

}
class Password{
    static void enterpassword(int pass)throws InvalidPassword{
         if(pass==123){
            throw new InvalidPassword();
         }
    }
}
public class Mianprgram1 {

    public static void main(String[] args) {
        try{
        Password.enterpassword(1234);
        System.out.println("Welcome");
        }
        catch(Exception e){
            System.out.println("Invalid passowrd");
        }
    }
}