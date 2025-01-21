public class MainString1 {
public static void main(String[] args) {
    String nam="Debabrata";
    //Aporach 1
    char[] arr=nam.toCharArray();
    for(int i=arr.length-1;i>=0;i--){
        System.out.print(arr[i]);
    }
    //Aporach 2
    System.out.println();
    StringBuffer s1=new StringBuffer(nam);
    System.out.print(s1.reverse());
    //Aporach 3
    System.out.println();
    StringBuilder s2=new StringBuilder(nam);
    System.out.print(s2.reverse());
}    
}