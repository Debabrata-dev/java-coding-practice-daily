class Car{
static void DemoCar(){
    System.out.println("Hello Car1");
}
}
class Bike extends Car{
Bike(){
    System.out.println("Hello BIKE!");
}
}

public class MainSUb{
public static void main(String[] args) {
       Bike b1=new Bike();
    
    }
}