public class MinMax {
    public static void main(String[] args) {
        int[] a1={112,23,43,32,3,11,76};
        int max=a1[0];
        int min=a1[0];
        for(int i=0;i<a1.length;i++){
         if(a1[i]>max){
          max=a1[i];
         }
         if(a1[i]<min){
            min=a1[i];
         }
        }

        System.out.println("This is the min value "+min+" This is the max value "+max);
    }
}
