package Com.PlaywithNumbers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class config {

	public static void main(String[] args) throws IOException {
		
		Properties prop=new Properties();
		
			FileInputStream ip=new FileInputStream("C:\\Users\\mmango\\eclipse-workspace\\Basics\\src\\Com\\PlaywithNumbers\\config.File");
		
		prop.load(ip);
		String ur=prop.getProperty("url");
		System.out.println(ur);
	

	}

}
