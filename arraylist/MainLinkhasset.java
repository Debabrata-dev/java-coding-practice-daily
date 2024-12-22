import java.util.LinkedHashSet;
public class MainLinkhasset {
    public static void main(String[] args) {
        LinkedHashSet s1=new LinkedHashSet<>();
        //it give the value in order .
        System.out.println("--".repeat(10));
        s1.add(60);
        s1.add(70);
        s1.add(80);
        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.add(40);
        s1.add(50);
        s1.add(60);
        s1.add(70);
        s1.add(80);
        System.out.println(s1);        
        System.out.println("--".repeat(10));
    }
}
//linkedhash set