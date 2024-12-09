class Example1{
    int employeId=101;
}
class Example2{
    int employeId=101;
    @Override
    public int hashCode(){
        return employeId;
    } 
}

public class Mainclass1 {
    public static void main(String[] args) {
        Example1 e1=new Example1();
        System.out.println(e1);
        Example2 e2=new Example2();
        System.out.println(e2);
    }
}
