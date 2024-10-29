abstract class Absmethod{
   abstract void test();
   abstract void play();
}
class Sample extends Absmethod{
    @Override
    void test(){
        System.out.println("test()---");
    }
    void play(){
        System.out.println("play()---");
    }
}
public class Abstrctiona{
    public static void main(String[] args) {
        Absmethod ref=new Sample();
        ref.test();
        ref.play();
    }
}