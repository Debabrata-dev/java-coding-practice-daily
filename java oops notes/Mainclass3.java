//Zero arrgument constructor 
class Demo{
    int val=90;
    void test(){
        System.out.println("Executing test()");
    }
}
public class Mainclass3{
    public static void main(String[] args) {
        Demo d=new Demo();
        System.out.println(d.val);
        d.test();
    }
}