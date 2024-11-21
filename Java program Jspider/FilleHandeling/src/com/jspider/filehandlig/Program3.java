package com.jspider.filehandlig;
import java.io.File;
public class Program3 {
public static void main(String[] args) {
	File ref=new File("c:/FILEIO");
	boolean flag=ref.exists();
	if(flag==true) {
		ref.delete();
		System.out.println("Deleted");
	}
	else {
		System.out.println("File not exist");
	}
}
}
