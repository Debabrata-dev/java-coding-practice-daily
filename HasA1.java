class Battery{
    void Power(){
        System.out.println("600 MH batter");
    }
}
class Cammera{
    void MegaPixel(){
        System.out.println("600mga pixel batter");
    }
}
class Mobile{
Battery b=new Battery();
Cammera c=new Cammera();
}
public class HasA1 {
    public static void main(String[] args) {
        Mobile m=new Mobile();
        m.b.Power();
        m.c.MegaPixel();
    }
}
