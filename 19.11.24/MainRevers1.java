public class MainRevers1 {
    public static void main(String[] args) {
        int num=879;
        int revers=0;
        int n;
        while(num!=0){
         n=num%10;
         revers=revers*10+n;
         num=num/10;
        }
        System.out.println(revers);
    }
}
