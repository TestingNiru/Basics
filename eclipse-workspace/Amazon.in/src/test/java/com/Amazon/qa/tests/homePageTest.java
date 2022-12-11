package com.Amazon.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Amazon.qa.pages.homePage;

import junit.framework.Assert;

import com.Amazon.qa.Base.TestBase;

public class homePageTest  extends TestBase{
homePage homePage;
public homePageTest() {
	super();
}
@BeforeMethod
public void setUp() {
	intialization();
	homePage=new homePage();}

@Test
public void selectUrAdressTest() {
	boolean flag=homePage.validateselectUrAdress();
	Assert.assertTrue(flag);
}
@AfterMethod
public void TearDown() {
	driver.quit();
}

}

