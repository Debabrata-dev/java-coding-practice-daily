public class Arr {
 public static void main(String[] args) {
    int[] arr=new int[5];
    int sum=0;
   int p=arr.length;
    for(int i=1;i<arr.length;i++){
        arr[i]=i;
        System.out.println(arr[i]);
       sum+=arr[i];
    }
    System.out.println(sum/p);
 } 
}