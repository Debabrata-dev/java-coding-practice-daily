import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        int temp=0;
        Scanner s1=new Scanner(System.in);
        int num=s1.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=2;j<=i-1;j++){
                if(i%j==0){
                    temp++;
                }
            }
            if(temp==0){
                System.out.println(i);
            }
            else{
                temp=0;
            }
        }
    }
}
