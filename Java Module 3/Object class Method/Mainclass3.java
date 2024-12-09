class OneTimepaasword{
    private int otp=43567;
    @Override
    public boolean equals(Object obj){
        OneTimepaasword otp=(OneTimepaasword)obj;
        if(this.otp==otp.otp){
          return true;
        }
        else{
            return false;
        }
    }
}

public class Mainclass3 {
    public static void main(String[] args) {
        OneTimepaasword otp1=new OneTimepaasword();
        OneTimepaasword otp2=new OneTimepaasword();
        System.out.println(otp1);
        System.out.println(otp1.equals(otp2)); 
    }
}
