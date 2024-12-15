import java.util.LinkedHashSet;
public class MainClass3 {
    public static void main(String[] args) {
        LinkedHashSet set1=new LinkedHashSet<>();
        System.out.println("--".repeat(10));
        set1.add(1);
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
        set1.add(50);
        set1.add(60);
        set1.add(70);
        System.out.println(set1);
        System.out.println("--".repeat(10));
    }
}
