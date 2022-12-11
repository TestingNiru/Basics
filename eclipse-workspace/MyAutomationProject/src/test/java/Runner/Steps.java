package Runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.FB.Util.TestBase;

import FBPages.CreateAccountPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {
	
	WebDriver driver;
	@Given("^user in login page$")
	public void user_in_login_page() {
		WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  driver.get("https://en-gb.facebook.com/r.php");
		TestBase.intialisation(driver);
		
	
		
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String firstname, String Surname)  {
		CreateAccountPage crtAcpg=	PageFactory.initElements(driver, CreateAccountPage.class);
		crtAcpg.inputdata(firstname, Surname);
	

}}
