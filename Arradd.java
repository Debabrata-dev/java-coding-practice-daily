public class Arradd {
    public static void main(String[] args) {
        int sum=0;
        int[] arr={1,2,3,4,5,1,8};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            sum+=arr[i]; 
        }
       System.out.println(sum);
        
    }   
}
