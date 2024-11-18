public class MainPalindrome {
    public static void main(String[] args) {
       int num=121;
       int n=num;
       int var;
        int revers=0;
       while (num!=0) {
        var=num%10;
        revers=revers*10+var;
        num=num/10;
       } 
      if(revers==n){
        System.out.println("Palindrome");
      }
      else{
        System.out.println("Not a Palindrome");
      }
    }
}