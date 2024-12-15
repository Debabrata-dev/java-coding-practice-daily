import java.util.HashSet;
public class MainClass{
    public static void main(String[] args) {
        System.out.println("--".repeat(10));
        HashSet h1=new HashSet<>();
        h1.add(90);
        h1.add(10);
        h1.add(20);
        h1.add(30);
        h1.add(40);
        h1.add(69);
        h1.add(50);
        h1.add(60);
        h1.add(70);
        h1.add(80);
        System.out.println(h1.isEmpty());
        System.out.println(h1);//It's give the result in arandom order
        System.out.println("--".repeat(10));
    }
}