package WarrperClass;

public class MainClass {
public static void main(String[] args) {
	int a=90;
	Integer ref=new Integer(a);//Boxing
	System.out.println(ref);
	
    double b=45.6;
    Double obj=b;
    System.out.println(obj);//Boxing
}
}
