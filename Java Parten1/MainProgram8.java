public class MainProgram8 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
              if(i>=j){
                System.out.print(j+" ");
                j++;
              }
              else{
                System.out.print(" ");
              }
            }
            System.out.println();
        }
    }
}
