public class ManLarr {
   public static void main(String[] args) {
    int[] arr={10,20,30,40,05,87};
    int let=0;
    for(int i=0;i<=arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
            let=arr[i];
            arr[i]=arr[j];
            arr[j]=let;
            }
            else{
                let=arr[j];
            }
}
}
    System.out.println(let);
   } 
}
