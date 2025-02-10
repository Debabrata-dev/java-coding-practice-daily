package com.jspider.Jvabean;
import java.io.*;
class Account implements Serializable{
	private String Username;
	private String Password;
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
}

public class Mainclass{
public static void main(String[] args) {
	Account acc=new Account();
	acc.setPassword("Lucky");
	acc.setUsername("Debabrata Das");
	System.out.println(acc.getPassword());
	System.out.println(acc.getUsername());
}
}
