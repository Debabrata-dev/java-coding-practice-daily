class Student1{
    String name="Rama";
}
class Student2{
    String name="Rama";
    @Override
    public String toString(){
        return "String Name: "+name;
    }
}

public class MainToString {
 public static void main(String[] args) {
    Student1 s1=new Student1();
    Student2 s2=new Student2();
    System.out.println(s1);//IT iS the defult implemetion of toString();
    System.out.println(s2);//It is user defind .
 }    
}