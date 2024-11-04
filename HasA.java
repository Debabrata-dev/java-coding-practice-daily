class Engine{
    void Power(){
        System.out.println("Nitro power");
    }
}
class Drive{
 void ride(){
    System.out.println("Have Satring");
 }
}
class Car{
    Engine n=new Engine();
    Drive d=new Drive();
}
public class HasA {
    public static void main(String[] args) {
     Car c=new Car();
     c.n.Power();
     c.d.ride();   
    }
}
