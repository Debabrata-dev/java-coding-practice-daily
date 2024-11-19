public class MainFibnoci1 {
    public static void main(String[] args) {
        int n=10;
        int n1=0;
        int n2=1;
        int sum=0,i=1;

         while(n1<400){
            System.out.println(n1);
            sum=n1+n2;
            n1=n2;
            n2=sum;
            i++;
         }  
    }
}