class Parent{
void watchTv(){
    System.out.println("News/Serial");
}
}
class Child extends Parent{
@Override
void watchTv(){
    System.out.println("Cartoon");
}
}
public class mathOver {
    public static void main(String[] args) {
        Child c=new Child();
        c.watchTv();
        Parent p=new Parent();
        p.watchTv();
        Parent ref=new Child();
        ref.watchTv();
    }
}
