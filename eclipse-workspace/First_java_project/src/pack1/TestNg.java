package pack1;

import org.testng.annotations.Test;

public class TestNg {
	@Test(priority=2,description="this will login amazon page")
	public void login() {
		System.out.println("successfully login");
	}
	@Test(priority=1,description="it will click on shopbydeptbtn")
	public void clickOnshopByDept() {
		System.out.println("clicking done");	
	}

}
