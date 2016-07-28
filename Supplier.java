package com.niit.shopingcart;
import java.util.List;

public class Supplier {
	
	private String id;
	private String name;
	private String addres;
	private Product product;
	
	private List<Product> products;
	
	public Supplier(String id, String name, String addres, Product product, List<Product> products) {
		super();
		this.id = id;
		this.name = name;
		this.addres = addres;
		this.product = product;
		this.products = products;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	

}
