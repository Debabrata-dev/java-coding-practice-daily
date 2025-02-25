package FileHandling;

import java.io.File;
import java.io.IOException;

public class Maintext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File obj=new File("F:/FileIo/Demo.txt");
		try {
			boolean flage=obj.createNewFile();
			if(flage==false) {
				System.out.println("Success");
				obj.createNewFile();
			}
			else {
				
				System.out.println("Failed");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
