public class MainString0 {
    //remove specal charaecter int he string 
    public static void main(String[] args) {
        String str="#@j!a$v%s^c&ript";
        //Apporach 1
        String a1=str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(a1);

        
    }
}
