package com.Amazon.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.Amazon.qa.util.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
public TestBase(){
	prop=new Properties();
	FileInputStream ip;
	
		try {
			ip = new FileInputStream("C:\\Users\\mmango\\eclipse-workspace\\Amazon.in\\src\\main\\java\\com\\Amazon\\"
					+ "qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		 catch (IOException e) {
			e.printStackTrace();
		 }	
}

public void intialization() {
	String browserName=prop.getProperty("broser");
	if (browserName.equals("chrome")) {
		driver=WebDriverManager.chromedriver().create();
	}
	else if(browserName.equals("FF")){
		driver=WebDriverManager.firefoxdriver().create();
		
	}
	else {
		driver=WebDriverManager.iedriver().create();
	}
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_load_TimeOut, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.implicit_wait, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
}	
	

}
