class Sample{
 Sample(int a){
    System.out.println("This is the price");
 }
 Sample(String b){
    System.out.println("Debabrata");
 }
 Sample(double c){
    System.out.println("Double the Value");
 }
}
public class Parametrized {
    public static void main(String[] args) {
        Sample s=new Sample(23);
        Sample s1=new Sample("fyfyfy");
        Sample s2=new Sample(23.0);
    }
}
