public class Insert1 {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
        int element=39;
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
