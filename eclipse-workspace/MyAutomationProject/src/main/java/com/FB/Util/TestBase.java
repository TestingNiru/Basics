package com.FB.Util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
public TestBase(){
	try {
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\mmango\\eclipse-workspace\\MyAutomationProject\\"
				+ "src\\main\\java\\com\\FB\\config\\config.properties");
		prop.load(fis);
	}
	
	catch(IOException e) {
		e.getMessage();
	}
	}
public static void intialisation(WebDriver driver) {  
	
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Timeout,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait,TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	
	

	
	
}


			
			


	
}
		
		
		
		
		
	


