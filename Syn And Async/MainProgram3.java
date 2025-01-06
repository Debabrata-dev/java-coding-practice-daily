public class MainProgram3 {
    public static void main(String[] args){
        System.out.println("Program Started");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }

        System.out.println("Program end");
    }
}
