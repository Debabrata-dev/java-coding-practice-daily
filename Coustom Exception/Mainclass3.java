class InvalidClass extends Exception{

}
class Student {
    static void Mark(int standad) throws InvalidClass{
        if(standad>=10){
            throw new InvalidClass();
        }
    }
}

public class Mainclass3 {
    public static void main(String[] args) {
        try{
        Student.Mark(13);
        System.out.println("Welcome student");
        }
        catch(Exception e){
            System.out.println("Invalid class Enter correct class");
        }
    }
}
