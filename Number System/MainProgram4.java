public class MainProgram4 {
    public static void main(String[] args) {
        int y=3000;
        if((y%4==0&&y%100!=0)||(y%400==0)){
            System.out.println("Leep Year");
        }
        else{
            System.out.println("Not a Leep Year");
        }
    }
}
