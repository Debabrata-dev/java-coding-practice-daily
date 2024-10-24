class Window8{
void start(){
    System.out.println("Grid templet Show");
}
}
class Window10 extends Window8{
    void start(){
        System.out.println("List View");
    }
}
class Window11 extends Window10{
    void start(){
        System.out.println("Box Model");
    }
}
public class Window {
public static void main(String[] args) {
Window11 k=new Window11();
k.start();
Window8 key=new Window11();//upcasting
key.start();

}}