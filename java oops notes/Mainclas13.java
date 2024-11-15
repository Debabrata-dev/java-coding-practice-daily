abstract class Sample{
abstract void game();

}
class Delta extends Sample{
 void game(){
    System.out.println("Gameing ");
 }

}
public class Mainclas13 {
    public static void main(String[] args) {
        Delta d=new Delta();
        d.game();
    }
}
