class Circle{
    int redi=9;
    public boolean equals(Object obj){
        Circle c=(Circle)obj;
        if(this.redi==c.redi){
            return true;
        }
        else{
            return false;
        }
    }
}
public class Program4 {
    public static void main(String[] args) {
        Circle c1=new Circle();
        Circle c2=new Circle();
     System.out.println(c1.equals(c2));
    }
}
