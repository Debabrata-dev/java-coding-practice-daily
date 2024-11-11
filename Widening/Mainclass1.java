class Product{
void type(){
System.out.println("electronic");
}
}
class Mobile extends Product{
void ram(){
    System.out.println("64gb");
}
}
class Telivision extends Product{
void display(){
    System.out.println("Amolet Display");
}
}
public class Mainclass1 {
    public static void main(String[] args) {
       Product obj=new Mobile();
       obj.type();
       
    }
}
