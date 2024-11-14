//Deep copy example
class Player{
String name="kholi";
}

public class Mainclass {
   public static void main(String[] args) {
    Player p1=new Player();
    Player p2=new Player();
    p2.name="Ms dhoni";
    System.out.println(p1.name);
    System.out.println(p2.name);
   } 
}
