package com.jspider.Jvabean;
import java.io.Serializable;
class Car implements Serializable{
	private int id;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
public class Mainclass1 {
public static void main(String[] args) {
	Car c1=new Car();
	c1.setId(89);
	c1.setPrice(8978.9);
	System.out.println(c1.getId());
	System.out.println(c1.getPrice());
}
}
