public class COLENE implements Cloneable{
    int hiscore;
    public static void main(String[] args) throws CloneNotSupportedException
    {
        COLENE p=new COLENE();
        p.hiscore=8000;
        COLENE c=(COLENE)p.clone();
        System.out.println(c.hiscore);
    }
}
