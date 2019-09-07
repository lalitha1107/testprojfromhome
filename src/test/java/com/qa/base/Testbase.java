package com.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.sun.tools.sjavac.Log;

public class Testbase {
	
	public Properties prop;
	InputStream inputStream;
	String propFileName;
  public   static String url;
   public  static String username;
    public static String pwd;
public static WebDriver driver;
	 
	//Testbase tb=new Testbase();
	 
	
	public Testbase() throws IOException
	{
		 prop = new Properties();
		
		 propFileName= "C:\\Users\\Home\\Downloads\\SeleniumDemo-master\\config\\config.properties";
		 //propFileName = System.getProperty("user.dir")+"/src/main/java/com/qa/config/config.properties";

		  try {
	            prop.load(new FileInputStream(propFileName));
	            //prop.load(this.getClass().getClassLoader().getResourceAsStream("configuration.properties"));
	        } catch (IOException e) {
	            System.out.println("Configuration properties file cannot be found");
	        }
		 url=prop.getProperty("url");
		System.out.println("urllllll" + url);
		
		username=prop.getProperty("username");
		
		System.out.println("username" + username);
		
		pwd=prop.getProperty("pwd");
		System.out.println("pwd " + pwd);
		
		
		
       

		
		
		
	}
	
	public static void intialization()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		
		driver.get(url);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
	}
	

}
