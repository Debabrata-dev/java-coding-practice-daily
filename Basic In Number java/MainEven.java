class Even{
     static boolean even(int n){
      if(n%2==0){
        return true;
      }
      else{
        return false;
      }
    }
}
public class MainEven {
    public static void main(String[] args) {
        System.out.println(Even.even(78));
    }
}
