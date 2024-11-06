public class Clone1 implements Cloneable{
    int b;
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Clone1 c1=new Clone1();
        c1.b=90;
         Clone1 obj=(Clone1)c1.clone();
         System.out.println(obj.b);
    }
}
