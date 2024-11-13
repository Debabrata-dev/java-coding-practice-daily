class Car{
int roll=90;
}
class Game extends Car{
    String name="dets";
    void dis(){
        String name="Geses";
        System.out.println(super.roll);
        System.out.println(this.name);
        System.out.println(name);
    }
}
public class Mainclass2 {
 public static void main(String[] args) {
    Game obj=new Game();
    obj.dis();

    }
}
