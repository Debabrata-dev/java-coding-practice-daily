package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class MainProgram {

	public static void main(String[] args) {
ArrayList<Integer> a1=new ArrayList<Integer>();
a1.add(1);//
a1.add(3);//
a1.add(9);
a1.add(18);
a1.add(2);
a1.add(0);
Iterator<Integer> i=a1.iterator();
while(i.hasNext()) {
	Integer number=i.next();
	System.out.println(number);
}


	}

}
