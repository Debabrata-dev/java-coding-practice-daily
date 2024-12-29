//Maximum number in array 
public class MainMax{
public static void main(String[] args) {
int arr[]={50,2,30,20,40,80,10};
int max=arr[0];
for(int i=0;i<arr.length;i++){
    if(arr[i]>max){
        max=arr[i];
    }
}
System.out.println(max);
    }
}