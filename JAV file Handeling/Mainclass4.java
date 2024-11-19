import java.io.File;
public class Mainclass4 {
    public static void main(String[] args) {
      File ref=new File("F:/FILEIO");
      boolean flag=ref.delete();
      if(flag==true){
        ref.delete();
        System.out.println("File is deleted");
      }
      else{
        System.out.println("File is not there");
      }
    }
}