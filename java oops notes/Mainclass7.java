class Add{
    Add(){
        System.out.println("Adtwo number");
    }
    Add(int a){
        System.out.println("34");
    }
    Add(double b){
        System.out.println("Double number");
    }
}
public class Mainclass7 {
 public static void main(String[] args) {
        Add a=new Add();
        Add a1=new Add(23);
        Add a2=new Add(98.9);
    }
}