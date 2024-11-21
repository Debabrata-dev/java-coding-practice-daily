package com.jspider.filehandlig;
import java.io.*;
import java.nio.*;
public class Program8 {
public static void main(String[] args) {
	BufferedWriter ref=null;
	try {
	    ref=new BufferedWriter(new FileWriter("C:/FILEIO/Game.txt"));
		ref.write("Jspider");
		ref.newLine();
		ref.write(97);
		ref.newLine();
		char[] ch= {'T','i','G','E','R'};
		ref.write(ch);
		ref.flush();
		System.out.println("Write Compileted");
	}
	catch(IOException e) {
	e.printStackTrace();	
	}
	
}
}
