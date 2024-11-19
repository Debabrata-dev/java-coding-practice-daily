//Folder creation Useing java 
import java.io.File;
public class Mainclass1 {
    public static void main(String[] args) {
        File ref=new File("F:/My File");
        boolean flag=ref.exists();
        if(flag==false){
          ref.mkdirs();
          System.out.println("New File is created");
        }
        else{
          System.out.println("File already Exist");
        }
    }
}
