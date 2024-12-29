public class MainMin {
    public static void main(String[] args) {
        int arr[]={50,2,30,20,40,80,10};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
