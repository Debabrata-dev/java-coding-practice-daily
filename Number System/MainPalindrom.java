import java.util.Scanner;
public class MainPalindrom {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int n=num;  
        int rev=0,temp;
        while(num!=0){
           temp=num%10;
           rev=rev*10+temp;
           num=num/10; 
        }
        if(n==rev){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not a Palindrome Number");
        }
    }
}
