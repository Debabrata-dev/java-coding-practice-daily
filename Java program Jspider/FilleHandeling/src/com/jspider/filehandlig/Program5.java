package com.jspider.filehandlig;
import java.io.File;
public class Program5 {
public static void main(String[] args) {
	File ref=new File("c:/FILEIO");
	String[] arr=ref.list();
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
}
}
