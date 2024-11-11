class Abb{
    int a;
   Abb(int a){
 this.a=a;

   }
}

public class paraAcces {
    public static void main(String[] args) {
        Abb g=new Abb(10);
        System.out.println(g.a);
    }
}
