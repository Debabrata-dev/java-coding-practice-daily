import java.util.Arrays;

public class SecondHigh {
    public static void print2Largest(int arr[]){
        int size=arr.length;
        if(size<2){
            System.out.println("Invalis input");
        }
        Arrays.sort(arr);
        // System.out.println(arr[size-2]);
        for(int i=size-2;i>=0;i--){
            if(arr[i]!=arr[size-1]){
        System.out.println("The Second largest element is"+arr[i]);
                return;
            }
            //if arr[i]==arr[size-i] it gives use to arr[size-2] 
        }
        System.out.println("there is no seconde largest element");
    }
    public static void main(String[] args) {
        int[] arr={1,4,5,35,34,34};
        print2Largest(arr);
    }
}
