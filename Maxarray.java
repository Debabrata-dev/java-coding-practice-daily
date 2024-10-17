public class Maxarray {
    public static void main(String[] args) {
      int[] arr={23,43,54,45,65,76};
      int max=arr[0];
      for(int i=1;i<arr.length;i++){
        if(arr[i]>max){
    max=arr[i];
        }
      }
      System.out.println(max);
    }
}
