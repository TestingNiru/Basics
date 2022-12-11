package FBPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FB.Util.TestBase;

public class CreateAccountPage extends TestBase{
	
	@FindBy(name="firstname")
	@CacheLookup
	WebElement firstnameTextBox;
	
	@FindBy(name="lastname")
	@CacheLookup
	WebElement SurnameTextBox;
	
	public CreateAccountPage() {
		PageFactory.initElements(driver,this);}
	
		public void inputdata(String firstname,String Surname) {
		firstnameTextBox.sendKeys(firstname);
		SurnameTextBox.sendKeys(Surname);}
	}
	
	
		
	


