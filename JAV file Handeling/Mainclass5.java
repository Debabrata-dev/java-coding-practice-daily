import java.io.File;
public class Mainclass5 {
    public static void main(String[] args) {
        File ref=new File("F:/My File/Demo.txt");
        boolean flag=ref.exists();
        if(flag==true){
            System.out.println(ref.length());
            System.out.println(ref.getAbsolutePath());
        }
        else{
            System.out.println("Not exist");
        }
    }
}
