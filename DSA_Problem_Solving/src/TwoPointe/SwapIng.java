package TwoPointe;

public class SwapIng {
static void swap(int a,int b) {
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a+" "+b);
}
	public static void main(String[] args) {
int a=9;
int b=10;
swap(a, b);

	}

}
