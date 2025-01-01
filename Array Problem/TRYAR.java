public class TRYAR {
    public static void main(String[] args) {
       int[] arr={1,1,9,8,7,3,4,89,98,98,30,7}; 
       int temp=0;
         for(int i=0;i<arr.length;i++){
          for(int j=i+1;j<arr.length;j++){
            if(arr[i]<arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
          }
          
         }
         System.out.println(temp);
         arr=remove(arr,temp);
    }
}
