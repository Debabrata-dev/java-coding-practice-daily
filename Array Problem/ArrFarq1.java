//How to find dublicate element in array 
public class ArrFarq1 {
    public static void main(String[] args) {
        int[] arr={12,12,3,4,5,6,7,6,8,0,0};
        System.out.println("FInd Dublicate");
        for(int i=0;i<arr.length;i++){
          for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j] && i!=j){
                System.out.println(arr[i]);
            }
          }
        }
    }
}
