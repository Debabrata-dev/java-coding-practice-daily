class Sample extends Thread{
@Override
synchronized public void run(){
    for(int i=0;i<5;i++){
        System.out.println("Hello World");
    }
}

}
public class MainProgram1 {
    public static void main(String[] args) {
        System.out.println("Main method start----");
       Sample s=new Sample();
       s.start();
        System.out.println("Main method end------");
    }
}
