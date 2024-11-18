public class MainSumdig {
    public static void main(String[] args) {
        int num=123;
        int n;int sum=0;
        while(num!=0){
         n=num%10;
         sum+=n;
         num=num/10;
        }
        System.out.println(sum);
    }
}
