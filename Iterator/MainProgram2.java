package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
class Employee{
	String name="Swagat";
	String salary="20000";
	String phno="3049";
	
	
}
public class MainProgram2 {

	public static void main(String[] args) {
ArrayList<String> a1=new ArrayList<String>();
a1.add("Virat");
a1.add("Rohit");
a1.add("Varun");
a1.add("Demo");
a1.add("Kemo");
Iterator<String> i1=a1.iterator();
while(i1.hasNext()) {
	String obj=i1.next();
	System.out.println(obj);
}

	}

}
