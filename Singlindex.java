class SoftwearDevloop{
    void Soft(){
        System.out.println("ST");
    }
}
class Javadevloper extends SoftwearDevloop{
 void dev(){
     System.out.println("java development");
 }
}

public class Singlindex{
    public static void main(String[] args) {
        Javadevloper j1=new Javadevloper();
        j1.Soft();
        j1.dev();
    }
}