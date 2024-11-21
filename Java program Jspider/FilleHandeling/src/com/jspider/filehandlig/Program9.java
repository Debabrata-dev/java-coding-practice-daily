package com.jspider.filehandlig;
import java.io.*;
public class Program9 {
public static void main(String[] args) {
	File ref=new File("C:/FILEIO/list.txt");
	boolean flag=ref.exists();
	PrintWriter pw=null;
	if(flag==false) {
		try {
			ref.createNewFile();
			File obj=new File("C:/FILEIO");
			String[] arr=obj.list();
			 pw=new PrintWriter(ref);
			for(int i=0;i<arr.length;i++) {
				pw.println(arr[i]);
			}
			pw.flush();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			pw.close();
		}
		
	}
	else {
		System.out.println("File exist");
		
	}
}
}
