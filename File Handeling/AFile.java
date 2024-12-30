import java.io.File;
import java.io.IOException;

public class AFile {
public static void main(String[] args) {
        File ref=new File("f:/My Evening/demo.txt");
        boolean flag=ref.exists();
        if(flag==false){
            try{
            ref.createNewFile();
            System.out.println("New File is created");
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
        else{
            System.out.println("Already exist");
        }
    }
}
