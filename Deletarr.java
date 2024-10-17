public class Deletarr {
public static void main(String[] args) {
        int[] arr={12,34,43,76,93,60};
        int delete=76;
        for(int i=0;i<arr.length;i++){
            if(delete==arr[i]){
                for(int j=i;j<arr.length-1 ;j++){
                    arr[j]=arr[j+1];
                }
            break;
         }}
         for(int i=0;i<arr.length-1;i++){
System.out.print(arr[i]+" ");
         }
}}
