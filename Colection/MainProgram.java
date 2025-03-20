package Colection;

class Product{
	int pid;
	double price;
	Product(int pid,double price){
		this.pid=pid;
		this.price=price;
	}
	@Override

	public String toString() {

		return "[pid:"+pid+" price:"+price+"]";
	}
}

public class MainProgram {
	public static void main(String[] args) {
Product[] cart=new Product[5];
cart[0]=new Product(101, 30000);
cart[1]=new Product(102, 40000);
cart[2]=new Product(103, 50000);
cart[3]=new Product(104, 60000);
cart[4]=new Product(105, 70000);

for(int i=0;i<cart.length;i++) {
	System.out.println(cart[i]);
}
	}

}
