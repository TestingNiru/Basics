package com.Amazon.qa.Base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autoSuggest {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=WebDriverManager.chromedriver().create();
driver.get("https://www.google.com/");
driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
Thread.sleep(3000);
List<WebElement> lst=driver.findElements(By.xpath("//ul[@class='erkvQe']"));
for(int i=0;i<lst.size();i++) {
	System.out.println(lst.get(i).getText());
}
	}

}
