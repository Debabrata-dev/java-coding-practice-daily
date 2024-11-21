public class HandeEx{
    public static void main(String[] args) {
        String str="98";
        try{
        int a=Integer.parseInt(str);
        System.out.println(a);
        }
        catch(NumberFormatException e){
            System.out.println("You cannot change this type of string to number");
        }
        finally{
            System.out.println("program close");
        }
    }
}