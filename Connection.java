package com.jspider.encapsulation;

public class Connection {
private static Connection con=new Connection();
public static Connection getConnection() {
	if(con==null) {
		con=new Connection();
	}
	return con;
}
private Connection() {
	
}
}
