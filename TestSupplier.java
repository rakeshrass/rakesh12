package com.niit.shopingcart;


import java.util.ArrayList;

import java.util.List;


public class TestSupplier {
	

	public static void main(String[] args) {
		
	
		Product p1= new Product(101, "Laptop",50_000);
		
		p1.setPrice(60_000);
		
		Supplier s1 = new Supplier("Rass","Google", "Hyderabad",p1,null);
		
		List<Product> productList =new ArrayList<Product>();
                  productList.add(p1);
		
		s1.setProduct(p1);
		
		Supplier s2 = new Supplier("Abcd","Yahoo","Chennai",p1,null);
		    s2.setProduct(p1);
		  
		    
		    System.out.println(s1.getId());
		    System.out.println(s1.getName());
		    System.out.println(s1.getAddres());
		    
		    
		    
		    System.out.println(s2.getId());
		    System.out.println(s2.getName());
		    System.out.println(s2.getAddres());
		    
		    System.out.println(p1.getId());
		    System.out.println(p1.getName());
		    System.out.println(p1.getPrice());
		    
		    
			
			
		
		
		//Supplier s2 = new Supplier("My101", "Company", "Delhi");		
		
		
		
		
		
		
		
		
		

	}

}
