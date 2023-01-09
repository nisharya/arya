package datadriven;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Classobjects {

	public static void main(String[] args) throws IOException {
		
		Properties obj=new Properties();
		
		obj.setProperty("Iphone", "true");
		obj.setProperty("Samsung", "false");
		obj.setProperty("oneplus", "true");
		
		String filepath="src\\datadriven\\output.properties";
		FileOutputStream fo=new FileOutputStream(filepath);
		obj.store(fo, "Product available status");
		
		
		

	}

}
