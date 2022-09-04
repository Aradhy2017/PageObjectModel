package abstract12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Read {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String fileLocation="D:\\Accelration\\Workspace\\DailyPractice\\src\\PropertyFile\\TestData.properties";
		
		FileInputStream fis = new FileInputStream(fileLocation);
	
		Properties prop=new Properties();	
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("ApplicationURL"));
	}

}
