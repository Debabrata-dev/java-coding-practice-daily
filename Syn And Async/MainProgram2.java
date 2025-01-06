class MyThread implements Runnable{
public void run(){
    System.out.println("go went gone");
}
}
public class MainProgram2 {
    public static void main(String[] args) {
      System.out.println("main method start----");  
Thread th=new Thread();
th.start();
      System.out.println("main method end----");  

    }
}
