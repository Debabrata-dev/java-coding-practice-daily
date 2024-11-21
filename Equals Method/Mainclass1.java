class Password{
private int Password=123;
@Override
public boolean equals(Object obj){
    Password p=(Password)obj;
    if(this.Password==p.Password){
  return true;
    }
    else{
        return false;
    }
}
}
public class Mainclass1 {
    public static void main(String[] args) {
       Password p1=new Password();
       Password p2=new Password();
       System.out.println(p1.equals(p2));
       
    }
}
