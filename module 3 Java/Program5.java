class Boy{
    int h=90;
    public boolean equals(Object obj){
       int p=90;
        if(this.h==p){
            return true;
        }
        else{
            return false;
        }
    }
}
public class Program5 {
    public static void main(String[] args) {
        Boy b1=new Boy();
        Boy b2=new Boy();
    System.out.println(b1.equals(b2));
    }
}
