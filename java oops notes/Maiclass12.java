abstract class Demo{
    abstract void test();
    abstract void play();
}
class Player extends Demo{
@Override
void  test(){
    System.out.println("testig");
}
@Override
void play(){
    System.out.println("playing");
}
}

public class Maiclass12 {
    public static void main(String[] args) {
        Player p1=new Player();
        p1.test();
        p1.play();
    }
}
