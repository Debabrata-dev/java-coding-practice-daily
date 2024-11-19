public class Mainclass {

    public static void main(String[] args) {
        String str="1234556";
        try{
       int a=Integer.parseInt(str);
       System.out.println(a);
        }
        catch(NumberFormatException e){
            System.out.println("String dosenot conver to Number");
        }
    }
}