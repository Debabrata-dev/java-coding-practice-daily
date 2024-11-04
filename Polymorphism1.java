class Card{
  void withdraw(){
System.out.println("With draw hacking");
  }
 void withdraw(int a){
    System.out.println("Withdraw 600$");
  }
}
public class Polymorphism1 {
public static void main(String[] args) {
    Card c1=new Card();
    c1.withdraw();
    c1.withdraw(9);
}}