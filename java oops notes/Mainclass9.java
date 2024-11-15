class ClassRoom{
    ClassRoom(){
        System.out.println("It is a class room");
    }
}
class Student extends ClassRoom{
    Student(){
        super();
        System.out.println("This is student");
    }
}

public class Mainclass9 {
    public static void main(String[] args) {
        Student s=new Student();
        
    }
}
