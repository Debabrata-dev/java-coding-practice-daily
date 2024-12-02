public class SumOfN{
    static int sumOfNo(int n){
        if(n==0){
            return 0;
        }
        int number=sumOfNo(n-1);
            return number+n;
        
    }
    public static void main(String[] args) {
        int ans=sumOfNo(5);
        System.out.println(ans);
    }
}