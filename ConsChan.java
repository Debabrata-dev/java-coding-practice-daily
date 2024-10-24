class Demo{
  Demo(){
System.out.println("Car");
  }
  Demo(int price){
   this();
   System.out.println("500000");
  }
}
public class ConsChan {
 public static void main(String[] args) {
    Demo d=new Demo(90);
 }}