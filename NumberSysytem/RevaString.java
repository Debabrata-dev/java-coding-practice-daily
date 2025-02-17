package NumberSysytem;

public class RevaString {

	public static void main(String[] args) {
		String s1="VIKASH";
		System.out.println(s1.charAt(3));
		int l1=s1.length();
		String rev="";
		for(int i=l1-1;i>=0;i--) {
			rev=rev+s1.charAt(i);
		}
System.out.println(rev);
		
		
	}
}
