//treeset
import java.util.TreeSet;
public class MainClass2 {
    public static void main(String[] args) {
        System.out.println("--".repeat(10));
        TreeSet set1=new TreeSet<>();
        System.out.println(set1.isEmpty());
        System.out.println(set1.size());
        set1.add(50);
        set1.add(90);
        set1.add(34);
        set1.add(98);
        set1.add(68);
        set1.add(68);
        set1.add(98);
        System.out.println(set1);
        System.out.println("--".repeat(10));//tree set gives out put in sorted order.
        
    }
}
