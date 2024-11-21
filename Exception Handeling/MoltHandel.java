public class MoltHandel {
    public static void main(String[] args) {
        try{
            int a=12,b=6,c;
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
             System.out.println("You can devid a number 0");
        }

        try{
            int[] a={12,23,43,45,44};
            System.out.println(a[6]);
        }
        catch(ArrayIndexOutOfBoundsException e){
   System.out.println("Number 6 is no found");
        }
    }
}
