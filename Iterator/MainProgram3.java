package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class MainProgram3 {
	public static void main(String[] args) {
ArrayList<Integer> a1=new ArrayList<Integer>();
a1.add(12);
a1.add(23);
a1.add(90);
a1.add(34);
a1.add(45);
a1.add(54);
a1.add(90);
a1.add(6);

Iterator<Integer> i1=a1.iterator();
while(i1.hasNext()) {
	Integer i=i1.next();
	if(i<50) {
	      i1.remove();
	      
	}
	
}
System.out.println(a1);
	}
}
