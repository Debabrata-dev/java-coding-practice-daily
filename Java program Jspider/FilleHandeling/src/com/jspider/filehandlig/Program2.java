package com.jspider.filehandlig;
import java.io.File;
import java.io.IOException;
public class Program2 {
public static void main(String[] args) {
	File ref=new File("c:/FILEIO/Demo.txt");
	boolean flag=ref.exists();
	if(flag==false) {
		try {
		ref.createNewFile();
		System.out.println("File Creation");
		}
		catch(IOException e) {
			e.printStackTrace();
		}  
	}
	else {
		System.out.println("Already exist");
	}
}
}
