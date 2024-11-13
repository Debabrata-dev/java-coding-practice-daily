class Alpha{
   int x=10;

}
class Beta extends Alpha{
    int x=200;
    void play(){
        System.out.println(super.x);//super is use to super class object
        System.out.println(this.x);//this is use to access the non static
        System.out.println(x);
    }
}
public class Mainclass{
    public static void main(String[] args) {
        Beta b=new Beta();
        b.play();
    }
}