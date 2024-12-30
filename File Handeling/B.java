import java.io.FileWriter;
import java.io.IOException;

public class B {
    public static void main(String[] args) {
        //FileWrite
        FileWriter ref=null;
        try {
            ref=new FileWriter("f:/My Evening/demo.txt",true);
            ref.write("Hello");
            ref.write("\n");
            ref.write("Borther");
            ref.write("\n");
            ref.write("How are You");
            ref.write("\n");
            ref.flush();
        } catch (IOException e) {
          e.printStackTrace();
        }
        finally{
            try{
            ref.close();
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
        
    }
}
