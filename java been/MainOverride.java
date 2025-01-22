class Parent{
 void watchTv(){
    System.out.println("News/Serial");
 }
}
class Child extends Parent{
void watchTv(){
    System.out.println("Cartoon");
}
}
class Child1 extends Parent{
 void watchTv(){
    System.out.println("Sports match");
 }
}
public class MainOverride {
    public static void main(String[] args) {
        Parent p1=new Child();
        p1.watchTv();
        Parent p2=new Child1();
        Child1 c1=(Child1)p2;
        c1.watchTv();
    }
}
///Method overriding is the concept of subclass inherit the peroperties of the superclass and changing 
/// Here we change the method defination 
/// to perform method overrriding inheritance is madatory .