class Amazon{
void payment(){
    System.out.println("COD");
}
void payment(long card){
    System.out.println("Payment by card");
}
void payment(String upi){
System.out.println("payment upi or netbanking");
}
}
public class Mainclass{
    public static void main(String[] args) {
        Amazon obj=new Amazon();
        obj.payment();
        obj.payment(8767564l);
        obj.payment("Sbin");
    }
}