import java.io.FileReader;
import java.io.IOException;

public class Bwrite {

    public static void main(String[] args) {
        FileReader ref=null;
        try{
            ref=new FileReader("f:/My Evening/demo.txt");
            int val=ref.read();
            while(val!=-1){
                System.out.print((char)val);
                val=ref.read();
            }
        }
        catch(IOException e){
              e.printStackTrace();
        }
        finally{
            try {
                ref.close();
            } catch (IOException e) {
          e.printStackTrace();
            }
        }
    }
}
