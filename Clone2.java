public class Clone2 implements Cloneable{
    int a;
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Clone2 b=new Clone2();
        b.a=908;
        Clone2 copy=(Clone2)b.clone();
        System.out.println(copy.a);
        System.out.println(b.a);
    }
}
