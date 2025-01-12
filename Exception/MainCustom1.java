class OverSpeedExceptin extends Exception{

}
class Main{
    static void tracifPolic(int speed) throws OverSpeedExceptin{
           if(speed>60){
            throw new OverSpeedExceptin();
           }
    }
}
public class MainCustom1 {
    public static void main(String[] args) {
        try {
            Main.tracifPolic(90);
        } catch (OverSpeedExceptin e) {
           
            e.printStackTrace();
        }
    }
}
