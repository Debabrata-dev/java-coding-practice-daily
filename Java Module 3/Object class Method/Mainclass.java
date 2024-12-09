class Student1{
    String name="Rama";
}
class Student2 extends Object{
   String name="Rama";
   @Override
   public String toString(){
    return "Student Name: "+name;
   }
}
public class Mainclass {
    public static void main(String[] args) {
        Student1 s=new Student1();
        Student2 s1=new Student2();
        System.out.println(s);
        System.out.println(s1);
    }
}
