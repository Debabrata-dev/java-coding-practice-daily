class Demo implements Runnable{

@Override
public void run(){
    for(int a=1;a<5;a++){
        System.out.println("Hello BRO");
    }
}
}
public class Mainrogram1 {
    public static void main(String[] args) {
        Thread th=new Thread();
        th.start();
        System.out.println("------------------");
        for(int i=1;i<5;i++){
            System.out.println("LOVE YOU LIKE");
        }
        System.out.println("------------------");
    }
}
