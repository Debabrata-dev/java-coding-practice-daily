//pArametized constructor 
class Developer{
    int price;
 Developer(int price){
    System.out.println(price);
    this.price=price;
    }
}

public class Mainclass6 {
    public static void main(String[] args) {
        Developer d=new Developer(100);
        System.out.println(d.price);
    }
}
