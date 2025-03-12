package MEMBER;
class Car{
	void dis() {
		System.out.println("display");
	}
}
public class MainNonstatic {
	public static void main(String[] args) {
Car c1=new Car();
		c1.dis();	
	}
}