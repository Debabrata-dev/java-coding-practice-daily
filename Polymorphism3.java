class Facbook{
    void response(){
        System.out.println("response");
    }
}
class FacbookMobile extends Facbook{
    void response(){
        System.out.println("response1");
    }
}
class FacbookWebsite extends Facbook{
    void response(){
        System.out.println("response2");
    }
}
public class Polymorphism3 {
    public static void main(String[] args) {
        Facbook f=new Facbook();
        f.response();
        f=new FacbookMobile();
        f.response();
        f=new FacbookWebsite();
        f.response();
    }
}
