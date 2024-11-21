package com.jspider.filehandlig;
import java.io.File;
public class Program1 {
public static void main(String[] args) {
	File obj=new File("c:/FILEIO");
	boolean flag=obj.exists();
	if(flag==false) {
		obj.mkdir();
		System.out.println("Folider Created");
	}
	else {
		System.out.println("Folder is already exist");
	}
}
}
