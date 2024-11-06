//Passing and returning object in Construtor//
class Car{
    int price;
    String model="Mohindra";
   void Car(int price){
       this.price=price; 
       System.out.println(price);
    }}
public class Mainclass {
    public static void main(String[] args) {
        Car n=new Car();
       n.Car(200000);
       System.out.println(n.model);
    }}
