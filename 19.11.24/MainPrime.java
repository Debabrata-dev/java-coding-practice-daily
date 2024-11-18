public class MainPrime{
    public static void main(String[] args) {
        int num=17; int count=0;
        int var;
        for(int i=1;i<=num;i++){
          if(num%i==0){
            count++;
          } 
        }
        if(count==2){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not aprime number");
        }
    }
}