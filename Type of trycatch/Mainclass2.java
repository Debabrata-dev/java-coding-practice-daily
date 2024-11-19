public class Mainclass2 {
    public static void main(String[] args) {
        try{
    int a=10,b=0,c=a/b;
    System.out.println("This is the division of valu of c"+c);
        }
        catch(ArithmeticException e){
        System.out.println("Can not devid");
        }
        try{
             int a[]={10,20,30,40};
             System.out.println(a[6]);
        }
        catch(ArrayIndexOutOfBoundsException b){
            System.out.println("Bound the array index");
        }
    }
}
