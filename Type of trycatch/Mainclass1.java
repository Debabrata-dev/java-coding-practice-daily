public class Mainclass1 {
    public static void main(String[] args) {
        try{
             System.out.println("Program start");
             int a=90,b=0,c;
             c=a/b;
             System.out.println(c);
             System.out.println("Hello");
        }
        catch(ArithmeticException e){
            System.out.println("You can not devid a number by zero");

        }
        finally{
           System.out.println("Program ended");
        }
        System.out.println("main method ended");
    }
}
