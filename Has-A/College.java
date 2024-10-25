class Department{
void test(){
    System.out.println("Doing test");
}

}
class Teacher{
    Department d=new Department();
void teach(){
    System.out.println("Teching");
}
}
public class College {
public static void main(String[] args) {
Teacher t=new Teacher();
t.teach();
t.d.test();

    }
}