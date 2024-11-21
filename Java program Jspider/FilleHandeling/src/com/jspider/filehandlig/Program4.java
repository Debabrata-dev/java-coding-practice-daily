package com.jspider.filehandlig;
import java.io.File;
public class Program4 {
public static void main(String[] args) {
	File ref=new File("c:/FILEIO/Demo.txt");
	boolean flag=ref.exists();
	if(flag==true) {
		System.out.println(ref.length());
		System.out.println(ref.getAbsolutePath());
	}
	else {
		System.out.println("File Does Not Exist");
	}
}
}
