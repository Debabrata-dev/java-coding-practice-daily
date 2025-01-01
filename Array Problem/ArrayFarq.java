//Find the dublicate element 
public class ArrayFarq {
    public static void main(String[] args) {
  
        int[] arr={2,4,5,2,6,6,3,7,8,9,10,11};
        System.out.println("dublicate Element");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j] && (i!=j)){
                    System.out.println(arr[j]);
                }
            }
        }

    }
}
