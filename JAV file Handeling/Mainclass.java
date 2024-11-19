import java.io.File;
public class Mainclass{
    public static void main(String[] args) {
       File obj=new File("F:/FILEIO");
       boolean flag=obj.exists(); 
       if(flag==false){
             obj.mkdirs();
             System.out.println("File is Created");
       }
       else{
        System.out.println("File is not created");
       }
    }
}