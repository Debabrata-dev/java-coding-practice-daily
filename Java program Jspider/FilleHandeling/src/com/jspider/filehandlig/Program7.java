package com.jspider.filehandlig;
import java.io.FileWriter;
import java.io.IOException;
public class Program7 {
public static void main(String[] args) {
	FileWriter ref=null;
	try {
	ref=new FileWriter("c:/FILEIO/Demo.txt");
	ref.write("Abc");
	ref.write("\n");
	ref.write(65);
	ref.write("\n");
	char[] ch={'J','A','V','A'};
	ref.write(ch);
	ref.flush();
	System.out.println("Write Completed");
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	finally {
		try {
		ref.close();
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
	}
	
}
}
