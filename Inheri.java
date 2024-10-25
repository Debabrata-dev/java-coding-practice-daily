class AzamonP{
AzamonP(){
    System.out.println("Watch video without add");
}
}
class Azamon extends AzamonP{
Azamon(int a){
   
    System.out.println("Watch video with add");
}

}
public class Inheri {
    public static void main(String[] args) {
        //Thier are 3 typ eof inheeritance
        //Single,Multilevel,Herarchical,Multiple,Hybrid
        //Ex-Single
       Azamon s=new Azamon(1);
    }
}
