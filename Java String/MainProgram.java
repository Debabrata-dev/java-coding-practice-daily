public class MainProgram{
    public static void main(String[] args) {
        String s="leveL";
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }

        if(s.equalsIgnoreCase(rev)){
            System.out.println("True");
        }
        else{
            System.out.println("Not True");
        }
    }
}