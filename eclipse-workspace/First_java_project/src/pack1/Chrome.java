package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Chrome {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.co.uk/");
		}
	
	@Test(priority=1)
	public void verifypageTitleTest() {
	String title=	driver.getTitle();
	System.out.println(title);
	
	}
	@Test(priority=2)
	public void clickOnShopByDept() {
		driver.findElement(By.xpath("//a[@id='nav-your-amazon']")).click();

}
	
	}
