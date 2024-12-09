class PhoneNumber{
    private int num=1233;
    @Override
    public boolean equals(Object obj){
        PhoneNumber ref=(PhoneNumber)obj;
        if(this.num==ref.num){
            return true;
        }
        else{
            return false;
        }
}}

public class Mainclass4 {
    public static void main(String[] args) {
        PhoneNumber p1=new PhoneNumber();
        PhoneNumber p2=new PhoneNumber();
        System.out.println(p1.equals(p2));
    }
}
