package com.jspider.encapsulation;

public class Resource {
private static Resource r=null;
public static Resource getResource() {
	if(r==null) {
		r=new Resource();
	}
	return r;
}
private Resource() {
	
}
}
