public class MainAutomorphic {
    public static void main(String[] args) {
        int N=25;
        if(Isautomorphic(N)){
            System.out.println("Automorphic");
        }
        else{
            System.out.println("Not Automorphic");
        }
    }
    static boolean Isautomorphic(int N){
        int sq=N*N;
        while(N>0){
            if(N%10 !=sq%10){
                return false;
            }
            else{
                N=N/10;
                sq=sq/10;
            }
        }
        return true;
    }
}
