class Irctc{
    void nameOfTrain(){
        System.out.println("Search train");
    }
    void nameOfTrain(int Num){
        System.out.println("Search train/By train number"); 
    }
    void nameOfTrain(String Name){
        System.out.println("Search train/By train name");
    }
}
public class Unit{
    public static void main(String[] args) {
        Irctc k=new Irctc();
        k.nameOfTrain();
        k.nameOfTrain(45);
        k.nameOfTrain("int city");
    }
}