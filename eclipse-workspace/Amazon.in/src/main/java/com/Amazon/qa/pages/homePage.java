package com.Amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Amazon.qa.Base.TestBase;

public class homePage extends TestBase  {
	//pagefactory/OR
	
@FindBy(xpath="//a[@id='nav-logo-sprites']")
WebElement Amazonlogo;
	
@FindBy(xpath="//a[@id='nav-logo-sprites']")
WebElement selecturAddress;

@FindBy(xpath="//input[@id='nav-search-submit-button']")
WebElement searchbtn;

public homePage(){
	PageFactory.initElements(driver, this);
}
public static String validateHomePage() {
	return driver.getTitle();
	
}
public  boolean validateselectUrAdress() {
	return selecturAddress.isDisplayed();
}

public  boolean validateSearchBtn() {
	return searchbtn.isEnabled();
}



}
