//Sortin the elemetin decending order
public class ArrSecSmall {
    public static void main(String[] args) {
        int[] arr={12,32,42,52,62,70,72,80,82,82};
         int temp;
         for(int i=0;i<arr.length;i++){
          for(int j=i+1;j<arr.length;j++){
            if(arr[i]<arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
          }
         }
         System.out.println(arr[0]);
    }
}
