import java.io.File;
import java.io.IOException;
public class Mainclass2 {
    public static void main(String[] args) {
    File ref=new File("F:/My File/Demo.txt");
    boolean flag=ref.exists();
    if(flag==false){
        try{
       ref.createNewFile();
       System.out.println("A new text file created");
        }
        catch(IOException e){
          e.printStackTrace();
        }
    }   
    else{
      System.out.println("File already exist");
    } 
    }
}
