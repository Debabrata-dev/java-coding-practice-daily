package java_Notes;
interface A{
	void play();
}
class B implements A{
	public void play() {
	System.out.println("PLAY");		
	}	
}
public class Demo {
public static void main(String[] args) {
	A a1=new B(); 
	a1.play();
}
}
