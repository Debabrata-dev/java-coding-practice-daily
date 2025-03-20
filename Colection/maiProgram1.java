package Colection;
class Student{
	String name;
	double cgpa;
	Student(String name,double cgpa){
		this.name=name;
		this.cgpa=cgpa;
	}
	@Override
	public String toString() {
	
		return "[Name:"+name+" Cgpa:"+cgpa+"]";
	}
}
public class maiProgram1 {

	public static void main(String[] args) {
	Student[]  s1=new Student[5];
	 s1[0]=new Student("a", 9.1);
	 s1[1]=new Student("b", 8.1);
	 s1[2]=new Student("c", 9.2);
	 s1[3]=new Student("d", 7.1);
	 s1[4]=new Student("e", 6.1);

for(int i=0;i<s1.length;i++) {
	System.out.println(s1[i]);
}
	}

}
