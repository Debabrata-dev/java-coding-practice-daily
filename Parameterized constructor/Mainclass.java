class Car{
 Car(){
    System.out.println("This is a Black color car");
 }
}
class BMW extends Car{
BMW(){
    super();
    System.out.println("BMW 69gclass");
}
}
class Jaguare extends Car{
    
   Jaguare(){
    super();
    System.out.println("Jaguare 49aclass");
   }
}

public class Mainclass {
  public static void main(String[] args) {
    Jaguare j=new Jaguare();
    BMW b=new BMW(); 

  }  
}
