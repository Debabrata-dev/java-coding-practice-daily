class SampleThread extends Thread{
@Override
public void run(){
    for(int i=1;i<5;i++){
        System.out.println("Hello BRO");
    }
}
}
public class MainProgram{
    public static void main(String[] args) {
        System.out.println("PROGRAM START---------");
        SampleThread th=new SampleThread();
        th.start();
        System.out.println("-----".repeat(50));
    }
}

///Java Lang thread class by extending 