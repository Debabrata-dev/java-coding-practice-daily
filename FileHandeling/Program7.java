package FileHandeling;

import java.io.File;

public class Program7 {
public static void main(String[] args) {
	File ref=new File("f:/My Handel");
	String[] arr=ref.list();
	for(int i=0;i<arr.length;i++) {
		File obj=new File(ref,arr[i]);
		boolean flag=obj.mkdir();
		if(flag==true) {
			System.out.println(arr[i]);
		}
	}
}
}
