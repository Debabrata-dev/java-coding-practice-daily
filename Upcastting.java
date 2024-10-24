class Product{
void deliver(){
    System.out.println("Deliver");
}
}
class Mobile extends Product{
    void mobileDeliver(){
        System.out.println("mobildeliver by bike"); 
    }
}
class Telivision extends Product{
    void tvDeliver(){
        System.out.println("Deliver by truck"); 
    }
}
public class Upcastting {
    public static void main(String[] args) {
       Telivision t1=new Telivision();
       t1.tvDeliver();

        Product t=new Telivision();
        t.deliver();
    }
}
