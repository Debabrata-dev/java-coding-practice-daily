class Demo{
   void play(){
    System.out.println("playing cricket");
   }
}
class Sample extends Demo{
    void dance(){
        System.out.println("Dancing");
       }
}
public class Mainclass11 {
    public static void main(String[] args) {
        Demo ref=new Sample();
        Sample obj=(Sample)ref;
       obj.dance();
        obj.play();
    }
}
//Down casting is not supported by the compiler Java compiler
//Down casting is the concept of the refrance variable of the superclass to refrance variable of subclass .
//To perform downcsting you must have to do upcasting .
//To perform down casting has to wrriten castinng statement .
//After down casting we can access both subclass and superclass .
