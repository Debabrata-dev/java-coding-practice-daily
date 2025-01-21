public class MainString{
     public static void main(String[] args) {
         //REVERS A String
         String str="hello";
         char[] Arr=str.toCharArray();
         //Convert string to array

         //Aproach 1
         for(int i=Arr.length-1;i>=0;i--){
          System.out.print(Arr[i]);
         }
         //Aporach 2
     System.out.println();
       StringBuffer sb=new StringBuffer(str);
       System.out.print(sb.reverse());
        //Aporach 3
        System.out.println();
       StringBuilder sb1=new StringBuilder(str);
       System.out.print(sb1.reverse());
        

     }
     

}