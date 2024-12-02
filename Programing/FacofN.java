public class FacofN {
    static int FacOfNo(int n){
        if(n==0){
            return 1;
        }
        int num=FacOfNo(n-1);
        return num*n;
    }
    public static void main(String[] args) {
         int Facof =FacOfNo(5);
         System.out.println(Facof);
    }
}
