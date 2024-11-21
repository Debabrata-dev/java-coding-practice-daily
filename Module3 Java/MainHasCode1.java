class Employ1{
   int emplyid=12;
}
class Employ2{
int emplyid=12;
@Override
public int hashCode(){
    return emplyid;
}
}
public class MainHasCode1 {
    public static void main(String[] args) {
      Employ1 e1=new Employ1();
      System.out.println(e1.hashCode());  
      Employ2 e2=new Employ2();
      System.out.println(e2.hashCode());
    }
}
