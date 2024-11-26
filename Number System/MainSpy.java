public class MainSpy {
    public static void main(String[] args) {
        int num=132;
        int sum=0,mul=1;
        int tem;
        while(num>0){
         tem=num%10;
         sum=sum+tem;
         mul=mul*tem;
         num=num/10;
        }
      if(mul==sum){
         System.out.println("Spy Number");
      }
      else{
        System.out.println("Not A spy Number");
      }
    }
}
