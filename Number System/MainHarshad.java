public class MainHarshad {
public static void main(String[] args) {
    int num=156;
    int sum=0;
    int n=num;
    int temp;
    while(num!=0){
      temp=num%10;
      sum+=temp;
      num=num/10;
    }
    if(n%sum==0){
        System.out.println("HarShad Number");
    }
    else{
        System.out.println("Not a HarShad Number");
    }
}  
}