class Name{
    private int nam=1234;
    @Override
    public boolean equals(Object obj){
        Name ref=(Name)obj;
        if(this.nam==ref.nam){
            return true;
        }
        else{
            return false;
        }
    }
}

public class Mainclass5 {
    public static void main(String[] args) {
        Name o1=new Name();
        Name o2=new Name();
        System.out.println(o1.equals(o2));
    }
}
