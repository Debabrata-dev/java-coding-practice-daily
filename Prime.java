public class Prime{
    public static void main(String[] args) {
        int num=15;
        int count=0;
        if(num>1){
          for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
             }
          }
        }
        else{
            System.out.println("Not a prime a number");
        }
if(count==2){
    System.out.println("primenumber");
}
else{
    System.out.println("Not");
}



    }
}