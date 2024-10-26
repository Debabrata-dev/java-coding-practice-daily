//palindrome a number which revers is also same as number//
public class Palindrome {
    public static void main(String[] args) {
        int num=121;
        int org=num;
        int rev=0;
        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;
            
        }
     if(rev==org){
        System.out.print("This");
     }
     else{
        System.out.println("thist"+rev+num);
     }
    }
}
