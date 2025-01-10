class Delta{
Delta(){
    System.out.println("this delta");
}
Delta(int a){
    System.out.println("this is delta 2");
}
}
class Example extends Delta{
    Example(){
        super(9);
        System.out.println("this is Example");
    }
    Example(int a){
        //super();
        System.out.println("This is example2");
    }
}
public class MainClass {
    public static void main(String[] args) {
        Example e1=new Example();  
    }
}
