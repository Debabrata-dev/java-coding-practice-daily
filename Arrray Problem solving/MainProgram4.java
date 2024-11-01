//Sorted element in an  array
public class MainProgram4 {
public static void main(String[] args) {
    int arr[]={6,2,7,5,3,3,5,5,7};
    int temp; int size;
    size=arr.length;
    System.out.println("Array size is"+size);

    for(int i=0;i<size;i++){
        for(int j=i+1;j<size;j++){
            if(arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }}}
for(int i=0;i<size;i++){
    System.out.println(arr[i]);
}
}}