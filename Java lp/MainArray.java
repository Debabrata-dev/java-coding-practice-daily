public class MainArray {
public static void main(String[] args) {
    int[] arr={12,23,45,56,13,45,76};
    for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
}
System.out.println("---".repeat(10));
    for(int j=arr.length-1;j>0;j--){
        System.out.println(arr[j]);
    }
}
    }