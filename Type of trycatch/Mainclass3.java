public class Mainclass3 {
    public static void main(String[] args) {
         try{
           int a=10,b=2,c;
           c=a/b;
           System.out.println(c);

           int arr[]={10,20,30,35};
           System.out.println(arr[0]);

           String str=null;
           System.out.println(str.toUpperCase());
         }
         catch(ArrayIndexOutOfBoundsException e){
System.out.println("This is array type of exception");
         }
         catch(ArithmeticException e){
            System.out.println("Arithmethic excption");
         }
         catch(NumberFormatException e){
              System.out.println("number Formating Excption");
         }
     catch(Exception e){
        System.out.println("All type of excption");
     }
    }
}
