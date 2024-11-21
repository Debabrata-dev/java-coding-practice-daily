class InvalidAgeExcptionVoting extends Exception{

}
class VotingMachine{
    static void verify(int age) throws InvalidAgeExcptionVoting{
        if(age<18){
         throw new InvalidAgeExcptionVoting();
        }
        else{
            System.out.println("you welcome");
        }
    }

}


public class CoustomE {
    public static void main(String[] args) throws InvalidAgeExcptionVoting {
        VotingMachine.verify(84);
    }
}
