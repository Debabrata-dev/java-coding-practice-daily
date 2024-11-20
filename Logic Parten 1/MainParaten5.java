public class MainParaten5 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
            if((i+j)%2==0){
                System.out.print(0+" ");
            }
            else{
                System.out.print(i+j+" ");
            }
            }
            System.out.println();
        }
    }
}
