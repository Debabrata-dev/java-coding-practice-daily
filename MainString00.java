public class MainString00 {
    ///How to remove the special charater
    /// for the string
   public static void main(String[] args) {
    String str1="D!$*@&*#*emo";
    String nor=str1.replaceAll("[^0-9a-zA-Z]", "");
    System.out.println(nor);
    ///second
    String a1="bvue$()&";
    String b=a1.replaceAll("[^0-9a-zA-z]", "");
    System.out.println(b);
   } 
}
