//compile time polly morphism
class Amazon{
    void payment(){
        System.out.println("Cod");
    }
    void payment(long card){
    System.out.println("Card 10% Discount");
    }
    void payment(String username,String password){
        System.out.println("net banking");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Amazon k=new Amazon();
        k.payment();
        k.payment(8555885l);
        k.payment("ftdtsss","5sr5");
    }
}
