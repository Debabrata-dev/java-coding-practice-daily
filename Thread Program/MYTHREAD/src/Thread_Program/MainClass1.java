package Thread_Program;
class SampleThread implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<5;i++) {
			System.out.println("Sample thread!!!");
		}
	}
}
public class MainClass1 {

	public static void main(String[] args) {
	System.out.println("--".repeat(10));
  SampleThread s1=new SampleThread();
  Thread th=new Thread();
  th.start();
  s1.run();
System.out.println("--".repeat(10));

}}
