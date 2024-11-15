class Delta{
  void run(){
     System.out.println("Excuting Run");
  }
}
class Example extends Delta{
  void send(){
    System.out.println("Excuting Send");
  }
}
public class Mainclass10 {
    public static void main(String[] args) {
 Delta s=new Example();
s.run();

    }
}
//It is the concept of assigning subclass refrance varibale to supperclass.


