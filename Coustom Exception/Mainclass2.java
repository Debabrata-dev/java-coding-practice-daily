class InvalidPhoneNumber extends Exception{

}
class User{
static void Enterphno(String phnumber) throws InvalidPhoneNumber{
if(phnumber.length()!=10){
     throw new InvalidPhoneNumber();
}
}
}
public class Mainclass2 {
    public static void main(String[] args) {
        try{
        User.Enterphno("9000000000");
        System.out.println("Welcome code");
        }
        catch(Exception e){
            System.out.println("Invalid phone nuber please enter correct phone number");
        }
    }
}
