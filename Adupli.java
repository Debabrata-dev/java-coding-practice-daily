public class Adupli {
    public static void main(String[] args) {
        int[] arr={12,21,32,32,43,21};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("The Value is find"+arr[i]);
                }}}}}
//Find dublicate value in array