package com.jspders.ClassAndObject;

class OneTimepassword{
	private int otp=45454;
	@Override
	public boolean equals(Object obj) {
		
		OneTimepassword one=(OneTimepassword)obj;
		if(this.otp==one.otp) {
			return true;
		}
		else {
			return false;
		}
	}
}


public class MainclassEqual {
public static void main(String[] args) {
	 OneTimepassword o1=new  OneTimepassword();
	 OneTimepassword o2=new  OneTimepassword();
	 System.out.println(o1.equals(o2));
}
}
