package pack2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class dropDownDemo {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\mmango\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
  WebDriver driver =new ChromeDriver();
   driver.get("https://en-gb.facebook.com/r.php");
  System.out.println(driver.getTitle());
		}

	}