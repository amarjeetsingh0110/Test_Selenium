import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;


public class Testing {

	Properties prop;
	FileInputStream fis;
	Logger log = Logger.getLogger(Testing.class.getClass());

	
	public void fileLoading() throws IOException
	{
		PropertyConfigurator.configure("./src/test/resources/configurations/log4j.properties");
		//Load Config File
		prop= new Properties();
		fis= new FileInputStream("./src/test/resources/configurations/mmt.config");
		prop.load(fis);
		log.info("Configuration File Loaded Successfully...!!!! ");
				
		//Load Locators File
		fis=new FileInputStream("./src/test/resources/locators/mmt.locators");
		prop.load(fis);
		log.info("Locators File Loaded Successfully...!!!! ");

		//Load Data File
		fis=new FileInputStream("./src/test/resources/testData/mmt.data");
		prop.load(fis);
		log.info("Data File Loaded Successfully...!!!! ");
		
		
		System.out.println(prop.getProperty("siteUrl"));
		System.out.println(prop.getProperty("oneWayTrip"));
		System.out.println(prop.getProperty("userName"));
		
	}

	public static void main(String[] args) throws IOException {
		Testing obj= new Testing();
		obj.fileLoading();
	}
}
