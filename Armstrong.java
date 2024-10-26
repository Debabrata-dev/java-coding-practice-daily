public class Armstrong {
    public static void main(String[] args) {
        int num=153;
        int t1=num;
        int length=0;
        while(t1!=0){
          t1=t1/10;
          length++;
        }
        int count=length;
int t2=num;
int arm=0;
while(t2!=0){
    int mul=1;
   int rem=t2%10;
   for(int i=1;i<=count;i++){
    mul=mul*rem;
   }
arm=arm+mul;
t2=t2/10;
}
if(arm==t1){
System.out.println("this is armstrong number");
}
else{
    System.out.println("this is not a armstrong number");
}
    }
}
