class Actor1{
    String name;
   Actor1(String name){
    this.name=name;
   }
public String toString(){
    return name;
}
}

public class MainArr {
    public static void main(String[] args) {
       Actor1[] a1=new Actor1[5];
       a1[0]=new Actor1("Demo0");
       a1[1]=new Actor1("Demo1");
       a1[2]=new Actor1("Demo2");
       a1[3]=new Actor1("Demo3");
       a1[4]=new Actor1("Demo4");
     for(int i=0;i<a1.length;i++){
        System.out.println(a1[i]);
     }
    }
}
