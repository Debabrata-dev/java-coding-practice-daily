package Colection;
class Employee{
	String role;
	int id;
	double ctc;
Employee(String role, int id, double ctc) {
		
		this.role = role;
		this.id = id;
		this.ctc = ctc;
	}
	@Override
	public String toString() {
	return "Employee [role="+ role +",eid="+ id +",ctc="+ ctc +"]";
	}
	
}
public class MainProgram2 {

	public static void main(String[] args) {
Employee[] e1=new Employee[5];
e1[0]=new Employee("developer", 0, 10000);
e1[1]=new Employee("manneger", 10, 200000);
e1[2]=new Employee("Tester", 20, 10000);
e1[3]=new Employee("developer", 30, 10000);
e1[4]=new Employee("developer", 40, 10000);
Employee e=e1[0];
for(int i=0;i<e1.length;i++) {
	
	//System.out.println(e1[i].ctc);
if(e1[i].ctc>e.ctc) {
	e=e1[i];
}
}
System.out.println(e.ctc);

	}

}
