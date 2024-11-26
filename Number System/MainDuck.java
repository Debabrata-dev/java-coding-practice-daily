public class MainDuck {
    public static void main(String[] args) {
        int num=102;
        int temp;
        while(num!=0){
         temp=num%10;
         if (temp==0) {
            System.out.println("Duck Number");
         }
         num=num/10;
        }
    }
}
