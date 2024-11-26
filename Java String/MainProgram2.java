public class MainProgram2 {
    public static void main(String[] args) {
        int num=1201; int n=num;
        int p=0;
        int rev=0;
        while(num!=0){
            p=num%10;
            rev=rev*10+p; 
            num=num/10;
        }
        if(rev==n){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
