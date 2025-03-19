package java_Notes;
class Laptop{
	String wallpaper="Karina";
}
public class Demo2 {

	public static void main(String[] args) {
Laptop t1=new Laptop();

Laptop t2=t1;
t1.wallpaper="KRK";
System.out.println(t1.wallpaper);
System.out.println(t2.wallpaper);
	}

}
