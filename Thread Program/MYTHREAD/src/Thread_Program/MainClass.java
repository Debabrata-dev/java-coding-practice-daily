package Thread_Program;
class Demo extends Thread {
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("DEMO!");
		}
	}
}
public class MainClass {
public static void main(String[] args) {
	System.out.println("Program start");
	Demo d1=new Demo();
	d1.start();
    
}
}
//thread by using extends