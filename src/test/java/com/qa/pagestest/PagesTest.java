package com.qa.pagestest;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Testbase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class PagesTest extends Testbase{
	
	
	
	public PagesTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}



	
	
	
	
	
	
	@Test
	public void login_test() throws IOException 
	{
		
LoginPage lp=new LoginPage(); 
		lp.login_click(username, pwd);
	}
	
	
}
