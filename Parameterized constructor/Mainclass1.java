class Father{
    Father(){
        System.out.println("owner of 60 square foot home");
    }
}
class Son extends Father{
    Son(){
        System.out.println("Owner 40 square foot hotel");
    }
}
class GrandSon extends Son{
    GrandSon(){
        System.out.println("Owner 400 square foot school"); 
    }
}

public class Mainclass1 {
    public static void main(String[] args) {
        GrandSon obj=new GrandSon();// Explict super() keyword is working   
    }
   
}
