package com.Runner;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepdefinitions {
	WebDriver driver;
	
	@Given("^user in login page$")
	public void user_in_login_page() { 
		WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://en-gb.facebook.com/r.php");
	  
	}
	
	@Then("^user enters \"(.*)\" and \"(.*)\"$")
		public void user_enters_firstname_and_Surname (String firstname,String Surname){
		driver.findElement(By.name("firstname")).sendKeys(firstname);
		
		driver.findElement(By.name("lastname")).sendKeys(Surname);
	}



}
