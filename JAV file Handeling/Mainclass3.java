import java.io.File;
public class Mainclass3 {
    public static void main(String[] args) {
       File ref=new File("F:/My File"); 
       boolean flag=ref.exists();
       if(flag==true){
        ref.delete();
        System.out.println("Deleted ");
       }
       else{
        System.out.println("File is not prest here");
       }
    }
}
