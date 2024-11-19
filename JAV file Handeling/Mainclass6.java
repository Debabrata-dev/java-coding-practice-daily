import java.io.File;

public class Mainclass6 {
    public static void main(String[] args) {
        File ref=new File("D:/");
        String[] arr=ref.list();
        for(int i=0;i<arr.length;i++){
         System.out.println(arr[i]);
        }
    }
}
