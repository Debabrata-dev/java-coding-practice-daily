public class Mainclass1 {
public static void main(String[] args) {
 int arr[]={12,32,34,54,45};
int max=arr[0];
 for(int i=0;i<arr.length;i++){
    
 if(arr[i]>max){
    max=arr[i];
 }
 }
 System.out.println(max);   
}  
}