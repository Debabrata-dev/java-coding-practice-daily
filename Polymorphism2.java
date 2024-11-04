//Run time polymorphism
class Card{
    void Swip(){
        System.out.println("Swip the card");
    }
}
class DebitCard extends Card{
    void Swip(){
        System.out.println("Swip the card1");
    }
}
class CreditCard extends Card{
    void Swip(){
        System.out.println("Swip the card2");
    }
}
public class Polymorphism2 {
    public static void main(String[] args) {
        Card c;
        c=new DebitCard();
        c.Swip();
        c=new CreditCard();
        c.Swip();
    }
}
