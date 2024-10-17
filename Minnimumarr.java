public class Minnimumarr {
    public static void main(String[] args) {
        int[] arr={90,78,56,39,74,190};
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
