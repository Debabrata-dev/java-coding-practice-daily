import java.util.ArrayList;
public class MainProgram{
    public static void main(String[] args) {
        ArrayList a1=new ArrayList<>();
        a1.add(12);//0
        a1.add(16);//1
        a1.add(90);//2
        a1.add(80);//3
        a1.add(4,null);
        // System.out.println(a1.get(4));
        // a1.clear();
        a1.remove(1);
        System.out.println(a1);
    }
}