class Sample{
    int a;
 void Sample(){
    a=35;
     System.out.println("Executting--" +a);
     
 }
}
public class ZeroCons {
    public static void main(String[] args) {
        Sample s=new Sample();
        System.out.println(s.a);
        s.Sample();
    }
}
