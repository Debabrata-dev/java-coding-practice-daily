class Amazon{
  Amazon(){
    System.out.println("shoping");
  }
  Amazon(int cost){
    this();
    System.out.println("Watch movie and listen music");
  }

}
public class BestConstructor {
    public static void main(String[] args) {
        Amazon ab=new Amazon(700);
        

    }
}
