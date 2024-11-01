//Dublicat element
public class MainProgram5 {
    public static void main(String[] args) {
      int arr[]={9,6,5,4,1,9,6,18};
      int n=arr.length;
      int temp;
      for(int i=0;i<n;i++){
        for(int j=i;j<n/2;j++){
            if(arr[j]>arr[j+1]){
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }}
            for(int j=n/2;j<n-1;j++){
                if(arr[j]<arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }}
        System.out.println(arr[i]);   
        }
      
    }
}
