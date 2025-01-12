import java.util.Scanner;

class InvalidMobileNum extends Exception{

}
class Mobile{
  
    static void mobileNum() throws InvalidMobileNum{
        Scanner s=new Scanner(System.in);
        String ph=s.nextLine();
        if(ph.length()!=10){
            throw new InvalidMobileNum();
        }
    }
}
public class MainCustom {
    public static void main(String[] args) {

        try{
        Mobile.mobileNum();

        }
        catch(InvalidMobileNum e){
            System.err.println("Invalid Mobile number");
        }
        finally{
            System.out.println("Main method end");
        }
    }
}
