interface Shape{
    void draw();
}
class Cricle implements Shape{
    @Override
   public void draw(){
    System.out.println("Circle is here");
   }
}

class Sequare implements Shape{
    @Override
    public void draw(){
       System.out.println("Sequare is present"); 
    }
}

public class Mainclass14 {
    public static void main(String[] args) {
        Sequare s1=new Sequare();
        Cricle c1=new Cricle();
        c1.draw();
        s1.draw();
    }
}
