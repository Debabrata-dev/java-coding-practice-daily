//Special Number
public class MainSpecial {
    public static void main(String[] args) {
        int num=59,n=num;
        int temp;
        int sum=0;
        int mul=1;
        while(num!=0){
           temp=num%10;
           sum=sum+temp;
           mul=mul*temp;
           num=num/10; 
        }
        int add=sum+mul;
        System.out.println(add);
        if(add==n){
            System.out.println("It is a Special Number");
        }
        else{
            System.out.println("It is not a Special Number");
        }
    }
}
