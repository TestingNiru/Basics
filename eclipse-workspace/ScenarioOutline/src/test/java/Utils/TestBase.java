package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriverException;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;



public class TestBase {
	public static ChromeDriverManager driver;
	public static Properties prop;
	
public TestBase(){
	try {
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\mmango\\eclipse-workspace\\MyAutomationProject\\"
				+ "src\\main\\java\\com\\FB\\config\\config.properties");
		prop.load(fis);
	}
	
	catch(IOException e) {
		e.getMessage();
	}
	
	
		