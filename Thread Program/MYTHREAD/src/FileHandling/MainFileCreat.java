package FileHandling;

import java.io.File;

public class MainFileCreat {
public static void main(String[] args) {
	File obj=new File("F:/FileIo");
	boolean flage=obj.exists();
	if(flage==false) {
		
		obj.mkdir();
	}
	else {
		System.out.println("ALreadey Exist");
	}
}
}
//obj.mkdir()