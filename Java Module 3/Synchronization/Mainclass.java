class Student{
    void read(){
        System.out.println("D");
    }
    synchronized void write(){
        System.out.println("Debabrata");
        System.err.println("Lucky");
    }
}

public class Mainclass{
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        s1.read();
        s2.read();
        s1.write();
        s2.write();
    }
}