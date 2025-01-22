class Account{
private double amount;
private long accoutnnumber;

public double getAmmount(){
    return amount;
}
public void setAmmount(double amount){
    this.amount=amount;
}

public long getAccnum(){
    return accoutnnumber;
}
public void setAccnum(long accoutnumber){
    this.accoutnnumber=accoutnumber;
}
}

public class MainBean {
public static void main(String[] args) {
 Account a1=new Account();
 a1.setAmmount(993947);
 System.out.println(a1.getAmmount());
 a1.setAccnum(3444663);
 System.out.println(a1.getAccnum());
}
    }