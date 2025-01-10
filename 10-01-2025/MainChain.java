class Demo{
 Demo(){
    System.out.println("Player ");
 }
 Demo(int a){
    System.out.println("player1");
 }
 Demo(String b){
    this(9);
    System.out.println("player2");
 }
}
public class MainChain {
    public static void main(String[] args) {
        Demo d1=new Demo("jj");
    }
}
