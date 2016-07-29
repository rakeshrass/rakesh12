package com.rass.shopingcart;

public class Dao {
	
	public boolean isValidUser(String id,String password)
	{
		if (id.equals("rass") &&  password.equals("rass"))
				
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
