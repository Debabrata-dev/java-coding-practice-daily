class Exam{
    void Paper(){
        System.out.println("I will fall");
    }
}
class BadBoy{
  void Student(){
    System.out.println("Debabrat Das");
  }
}
class College{
    Exam e=new Exam();
    BadBoy b=new BadBoy();
}
public class HasA2 {
    public static void main(String[] args) {
        
    
    College ref=new College();
    ref.e.Paper();
    ref.b.Student();
}}
