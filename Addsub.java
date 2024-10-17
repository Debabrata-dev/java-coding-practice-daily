import java.util.Scanner;
public class Addsub {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=s.nextInt();
       
        int ans=0;
        for(int i=0;i<=n;i++){
            if(i%2==0){
                ans-=i;
            }
            else{
              ans+=i;
            }
        }
        System.out.println(ans);
    }
}
