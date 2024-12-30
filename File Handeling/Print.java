import java.io.IOException;
import java.io.PrintWriter;

public class Print {
    public static void main(String[] args) {
        PrintWriter ref=null;
        try{
          ref=new PrintWriter("f:/My Evening/demo1.txt");
          ref.println("jspider");
          ref.println("JAVA FULL STACK");
          ref.println("PYSPIDER");
          ref.println(95);
          ref.println("Wrting");
          ref.flush();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            ref.close();
        }
    }
}
