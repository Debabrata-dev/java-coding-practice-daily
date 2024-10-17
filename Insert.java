public class Insert {
    public static void main(String[] args) {
        int[] arr={23,32,34,43,98,57,80};
        int element=40;
        int pos=3;
      for(int i=arr.length-1;i>pos-1;i--){
        arr[i]=arr[i-1];
      }
      arr[pos-1]=element;
      for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
      }
    }
}
 