package com.jspider.filehandlig;
import java.io.File;
public class Program6 {
public static void main(String[] args) {
	File ref=new File("c:/");
	String[] arr=ref.list();
	for(int i=0;i<arr.length;i++) {
	    File obj=new File(ref, arr[i]);
	    boolean flag=obj.isDirectory();
	    if(flag==true) {
	    	System.out.println(arr[i]);
	    }
	}
}
}
