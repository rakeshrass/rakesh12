package com.niit.shopingcart;
import java.util.List;

public class Product {
	private int id;
	private String name;
	
	private List<Supplier> suppliers;
	
	public Product(int id, String name,int price)
	{
		this.id = id;
		this.name = name;
		this.price= price;

	}
	public int price;
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	

	}

}
