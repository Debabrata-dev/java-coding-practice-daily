//get class provide full quallyfy class name
class Demo{

}
class Sample extends Demo{

}
public class Mainclass2 {
    public static void main(String[] args) {
        Object o1=new Demo();
        Object o2=new Sample();

        System.out.println(o1.getClass());
        System.out.println(o2.getClass());
    }
}
