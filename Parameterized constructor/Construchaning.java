class A{
  A(){
    System.out.println("Home");
  }
  A(int a){
    this();
    System.out.println("About");
  }
}
public class Construchaning {
  public static void main(String[] args) {
    A i=new A();
    A i1=new A(2);
  }  
}
