//Public bolean equals(Object obj);
class Circle{
    static int a=90;
    static int b=90;
  public static boolean same(){
                boolean c;
                return c=a==b;
    }
}
public class Mainclass {
public static void main(String[] args) {
    Circle c1=new Circle();
Circle c2=c1;
    System.out.println(c1.equals(c2));
}   //equals() it checked the memory location is same or not 
}