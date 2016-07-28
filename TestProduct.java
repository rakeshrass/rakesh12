package com.niit.shopingcart;

public class TestProduct {
	public static void main(String[] args){
		
		Product p1 = new Product(101, "mobile");
		Product p2 = new Product(102, "laptop");
		
		p1.setPrice(50_000);
		p2.setPrice(25_0000);
		
		System.out.println(p1.getId()  + p1.getName());
		System.out.println("Name:"+ p1.getName());
		System.out.println("Price:"+p1.getPrice());
		
		System.out.println("ID:" + p2.getId());
		System.out.println("Name:" + p2.getName());
		System.out.println("Price:" + p2.getPrice());
	}
}

