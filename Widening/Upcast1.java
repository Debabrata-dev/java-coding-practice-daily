class Delta{
void run(){
    System.out.println("runing");
}
}
class Sample extends Delta{
void play(){
    System.out.println("playing");
}
}
public class Upcast1 {
    public static void main(String[] args) {
        Delta obj=new Sample();
        obj.run();
        
    }
}
