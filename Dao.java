package com.rass.shopingcart;

public class Dao {
	
	public boolean isValidUser(String userID,String password)
	{
		if (userID.equals("rass")&&password.equals("rass"))
				
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
