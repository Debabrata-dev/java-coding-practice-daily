package Module1;
enum Day{
	Monday,ThusDay,Wednesday
}
interface Car{
	int price=90000;// default: public, static, and final  
void ride();
}
class Car1 implements Car{
	public void ride() {
		System.out.println("By me");
	}
	
}
public class MainProgram {
public static void main(String[] args) {
	Day today=Day.Monday;
	Day sec=Day.ThusDay;
	System.out.println(today);
	System.out.println(Car.price);
}
}
