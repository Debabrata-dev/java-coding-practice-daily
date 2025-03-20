package Colection;
class pen{
	
}
class Book{
	
}
public class MainProgram3 {

	public static void main(String[] args) {
Object[] arr=new Object[6];
arr[0]=new pen();
arr[1]=new pen();
arr[2]=new pen();
arr[3]=new Book();
arr[4]=new Book();
arr[5]="core java";
for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]);
}
	}

}
