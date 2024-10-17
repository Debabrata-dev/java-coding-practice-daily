class Paly{
    int num;
    String nam;
Paly(int num,String nam){
this.num=num;
this.nam=nam;
}
}

public class A {
    public static void main(String[] args) {
        Paly s1=new Paly(67,"Dhoni");
        System.out.println(s1.num);
       System.out.println(s1.nam);
    }
}
