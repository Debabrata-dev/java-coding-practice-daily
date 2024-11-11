class Fruit{
   void contenor(){
    System.out.println("it's basket");
   } 
}
class Apple extends Fruit{
    void app(){
        System.out.println("Red fruit");
    }
}
class Banna extends Fruit{
  void ban(){
    System.out.println("Yellow color fruit");
  }
}
public class Mainclass2 {
    public static void main(String[] args) {
      Fruit obj=new Banna();  
  obj.contenor();
    }
}
