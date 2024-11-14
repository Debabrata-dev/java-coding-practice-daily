class Sample{
 int k;
}
public class Hello{
    public static void main(String[] args) {
      Sample s=new Sample(); 
      s.k=(Integer) null; 
      System.out.println(s.k);
    }
}