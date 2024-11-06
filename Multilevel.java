class Single{
    void play(){
        System.out.println("Playing football");
    }
}
class Display extends Single{
    void run(){
        System.out.println("Runing");
    }
}
class Play extends Display{
    void ride(){
        System.out.println("Riding");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Play p=new Play();
        p.ride();
        p.play();
        p.run();
    }
}
