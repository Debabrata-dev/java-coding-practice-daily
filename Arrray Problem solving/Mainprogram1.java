//Makeing array by user input 
import java.lang.reflect.Array;
import java.util.*;


public class Mainprogram1 {
    public static void main(String[] args) {
int n;
Scanner input=new Scanner(System.in);
System.out.println("Enter arry size here");
n=input.nextInt();
int[] arr=new int[n];      
System.out.println("Enter array element");
for(int i=0;i<arr.length;i++){
    arr[i]=input.nextInt();
}
System.out.println("These are the array element");
for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
}



}}