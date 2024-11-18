public class MainRevers {
    public static void main(String[] args) {
        int num=123;
        int n,revers=0;
        
        while(num!=0){
        n=num%10;
        revers=revers*10+n;
        num=num/10;
        }
   System.out.println(revers);
    }
}
