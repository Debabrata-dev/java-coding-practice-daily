class A{
    void test(){
        System.out.println("Test method call ---");
    }
}
class B extends A{
    void play(){
        System.out.println("Play method ---");
    }
}
class C extends B{
    void eat(){
        System.out.println("Eat method ---");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        C en=new C();
        en.eat();
        en.play();
        en.test();
        
    }
}
