import java.util.Hashtable;
public class MainProgram1 {
    public static void main(String[] args) {
        Hashtable h1=new Hashtable<>();
        System.out.println("--".repeat(10));
        h1.put(4,"Forest Gum");
        h1.put(5,"Cast Away");
        h1.put(6,"Seven");
        h1.put(1,"Shasank");
        h1.put(2,"Green Mile");
        h1.put(3,"Lost City");
   
        //public object get();
        System.out.println(h1.get(3));
        //public object remove(); this is use to remoe the entity
        System.out.println(h1.remove(1));
        System.out.println(h1.containsKey(2));
        System.out.println(h1.containsValue("Lost city"));
        System.out.println(h1.keySet());//it gives to key as aset
        System.out.println(h1.values());//it give s to vlalue as aset
        System.out.println(h1);
    }
}
