class Actor2{
    String name;
    Actor2(String name){
        this.name=name;
    }
    public String toString(){
        return name;
    }
}
public class MainArr1 {
    public static void main(String[] args) {
        Actor2 a1=new Actor2("Chiken");
        Actor2 a2=new Actor2("Chiken1");
        Actor2 a3=new Actor2("Chiken2");
        Actor2 a4=new Actor2("Chiken3");
        Actor2 a5=new Actor2("Chiken4");
        Actor2[] arr={a1,a2,a3,a4,a5};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
