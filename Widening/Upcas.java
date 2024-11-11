class Demo{
int a=90;
}
class Sample extends Demo{
int b=89;
}
public class Upcas extends Demo{
    public static void main(String[] args) {
   
   Demo ref=new Sample();
   System.out.println(ref.a);
    }
}
