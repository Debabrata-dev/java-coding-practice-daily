package FileHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MainWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   try {
	PrintWriter obj=new PrintWriter("F:/FileIo/Demo.txt");
     obj.write("GGGGG");
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
