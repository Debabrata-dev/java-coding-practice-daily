public class MyPerfect {
    static void Perfect(int num){
        int temp=num;
        int sum=0;
       for(int i=1;i<num;i++){
        if(num%i==0){
            sum+=i;
        } 
       }
       if(sum==num){
        System.out.println(true);
       }
       else{
        System.err.println(false);
       }

    
    }
    public static void main(String[] args) {
        MyPerfect.Perfect(6);
    }
}
