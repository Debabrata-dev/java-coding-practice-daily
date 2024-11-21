package com.jspider.filehandlig;
import java.io.File;
import java.io.IOException;
public class Program10 {
public static void main(String[] args) {
	File ref=new File("C:/FILEIO/c.txt");
	boolean flage=ref.exists();
	if(flage==false) {
		try {
			ref.createNewFile();
			System.out.println("File Created");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	else {
		System.out.println("File Already Exists");
	}
}
}
