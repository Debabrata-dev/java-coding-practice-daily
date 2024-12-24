
class Student{
    String name="Rama";
}
class Student1 {
    String name="Rama";
    public String toString(){//ToString
        return "Student Name "+name;
    }
}
public class Mainclass{
    public static void main(String[] args) {
        Student s1=new Student();
        System.out.println(s1); 
        Student1 s2=new Student1();
        System.out.println(s2);
   
    }
}