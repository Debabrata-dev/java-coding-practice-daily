class Amazon{
static int a=56;    
Amazon(){
System.out.println("Executing the zero arrgument constructor"+" "+a);

}
}
public class Constructor {
    public static void main(String[] args) {
        Amazon a1=new Amazon();
        System.out.println(a1.a);
      
    }
}
