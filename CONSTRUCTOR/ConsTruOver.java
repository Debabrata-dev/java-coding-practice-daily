class Car{
void Car(){
  System.out.println("DAS");
}
void Car(int a){
    System.out.println("YO UO");
}
void Car(String b){
    System.out.println("Black niga");
}
}
public class ConsTruOver {

    public static void main(String[] args) {
        Car c=new Car();
        c.Car();
        c.Car(12);
        c.Car("Dines");
    }
}
