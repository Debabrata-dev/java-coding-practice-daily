class Actor{
String name;
Actor(String name){
    this.name=name;
}
public String toString(){
    return name;
}
}
public class MainArray {
    public static void main(String[] args) {
        Actor a1=new Actor("Barun");
        System.out.println(a1);
    }
}
