import java.util.HashMap;
public class MainProgram {
public static void main(String[] args) {
    HashMap l1=new HashMap<>();
    System.out.println("--".repeat(10));
    l1.put(1,"jaswal");
    l1.put(2,"Tavish Head");
    l1.put(3,"philsult");
    l1.put(4,"tilak varma");
    l1.put(5,"Axar patel");
    l1.put(6,"Rabis noe");
    l1.put(7,"Bumra");
    l1.put(8,"Mayank");
    l1.put(9,"Jofra");
    l1.put(10,"Wasin Ton");
    l1.put(11,"pathirana");
    //l1.put() use to add element in the Map
    
  
    //get(Object key) this method is use to return the vlue of the key publi object get(Object key);
    System.out.println(l1.get(4));
    //remove(Object key)
    System.out.println(l1.remove(10));
    System.out.println(l1);
    //public boolean continskey(object key) this method use to retun true if the value is present in the map
    System.out.println(l1.containsKey(10));
    System.out.println(l1.containsValue("Wasin Ton"));
    //public int keyset() this give s use to a key [] set .
    System.out.println(l1.keySet());
    System.out.println(l1.values());
    System.out.println(l1.size());
    System.out.println(l1.isEmpty());
    System.out.println("--".repeat(10));
}  
}