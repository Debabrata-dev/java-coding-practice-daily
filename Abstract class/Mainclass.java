abstract class Android{
abstract void call();
abstract void message();
}
class phone extends Android{
    void call(){
        System.out.println("call method---");
    }
    void message(){
        System.out.println("message method---");
    }
}
public class Mainclass {
    public static void main(String[] args) {
        Android an=new phone();
        an.call();
        an.message();
    }
}
