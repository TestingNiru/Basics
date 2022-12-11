package Com.PlaywithNumbers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileHandling {

	public static void main(String[] args) {
		copyFile();
	}
	public static void copyFile() {
		
		
		File file=new File("C://Niru//sample.pdf");
		File opfile=new File("C://Niru//sample1.pdf");
		FileInputStream fi=null;
		FileOutputStream fo=null;
		
		try {
		 fi =new FileInputStream(file);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			 fo=new FileOutputStream(opfile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(fi.available());
		} catch (IOException e) {
			e.printStackTrace();
		}
		int i=0;
		try {
			while((i=fi.read())!=-1) {
				fo.write(i);
				
			}
		} catch (IOException e) {		
			e.printStackTrace();
		}
		finally {
			if(fi!=null) {
				try {
					fi.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fo!=null) {
				try {
					fo.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		
	}
		

}
