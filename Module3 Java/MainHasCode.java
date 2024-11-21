class Student {
    int Roolnum=15;
}
class Student3{
    int mark=375;
    @Override
    public int hashCode(){
    return this.mark;
    }
}

public class MainHasCode {
    public static void main(String[] args) {
       Student s=new Student();
       System.out.println(s); 
       Student3 s1=new Student3();
       System.out.println(s1);
    }
}
