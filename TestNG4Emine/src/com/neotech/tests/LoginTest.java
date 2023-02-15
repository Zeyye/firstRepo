package com.neotech.tests;

import org.testng.annotations.Test;

import com.neotech.pages.LoginPageElements;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class LoginTest extends CommonMethods {

	@Test()
	public void valiLogin() 
	{
		
		
		LoginPageElements login=new LoginPageElements();
	    //send username
		
		sendText(login.username, ConfigsReader.getProperty("username"));
		//send passsword
		
		sendText(login.password, ConfigsReader.getProperty("password"));
		
		wait(2);
		//click on login
		
		jsClick(login.logInButton);
		
		wait(2);
		
		
		//and verify username
		
		String expected ="Jacqueline White";
		
		String actual=accountName.;
	}

}
