package Module3;
class Student1{
	String name="Rama";
	@Override
	public String toString() {
		return name;
	}
	
}
public class MainClass {
public static void main(String[] args) {
	Student1 s1=new Student1();
	System.out.println(s1);
}
}
