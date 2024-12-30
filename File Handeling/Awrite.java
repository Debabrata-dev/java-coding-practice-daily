import java.io.File;

public class Awrite {
    public static void main(String[] args) {
        File ref=new File("f:/My Evening/demo.txt");
       boolean flag=ref.exists();
       if(flag==true){
         ref.delete();
         System.out.println("Delete the file");
       }
       else{
         System.out.println("Error no file is there");
       }
    }
}
