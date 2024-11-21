public class Mainclass {
    public static void main(String[] args) {
        try{
         int a=10/3;
         System.out.println(a);
         int[] b={12,23,32,24,43};
         System.out.println(b[3]);
         String c=null;
         System.out.println(c.toUpperCase());
        }
        
        catch(NullPointerException e){
           System.out.println("You cannot convert the null to uppercase");
        }
        catch(ArrayIndexOutOfBoundsException e1){
            System.out.println("Array index out of bound");
        }
        catch(ArithmeticException e){
          System.out.println("Zero can not devid");
        }
        finally{
            System.out.println("MAin method close  ");
        }
    }
}
