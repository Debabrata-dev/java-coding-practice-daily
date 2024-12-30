import java.io.File;

public class A{
    public static void main(String[] args) {
        File ref=new File("f:/My Evening");//pathname
        if(ref.exists()==false){
            ref.mkdir();
            System.out.println("File is creates");
        }
        else{
            System.out.println("File is already");
        }
    }
}