public class MainString2 {
    ///Remove white space from the String 
    public static void main(String[] args) {
        String str=" a b  c d e f g  efeufc ebc ew ";
        ///trim methodis use toremove
        /// beore the string and after the string
        String nor=str.trim();
        System.out.println(nor);
  ////replaceAll("\\s","");
         String str1=str.replaceAll("\\s", "");
         System.out.println(str1);
        String nam="D e b a b r a t a";
         String str2=nam.replaceAll("\\s","");
         System.out.println(str2);
    }
}
