class Demo{
void test(int a){
System.out.println("test haveing int dt"+a);
}
void test(double a){
    System.out.println("test haveing double dt"+a);
}
void test(String a){
    System.out.println("test haveing String dt"+a);
}
}
public class Mainclass {
    public static void main(String[] args) {
      Demo d=new Demo();
        d.test(0);
        d.test(6.7);
        d.test("jack");
    }
}