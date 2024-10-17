public class Delete {
    public static void main(String[] args) {
        int[] arr={13,23,43,35,64,47};
        int delet=43;
        for(int i=0;i<arr.length;i++){
            if(delet==arr[i]){
                for(int j=i;j<arr.length-1;j++){
                    arr[i]=arr[i+1];
                } }  }
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
