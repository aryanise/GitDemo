package Acadamy.E2EProject;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.Base;
public class Verifytitle extends Base {
	private static Logger Log = LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initialization() throws IOException
	{
        driver=initializeDriver();
		
		driver.get(prop.getProperty("url"));
	}
	@Test 
	public void homepage() throws IOException
	{
		
	
		LandingPage lp=new LandingPage(driver);
		
			assertEquals(lp.gettitle().getText(), "FEATURED COUfygRSES");
			//Log.info("text displayed");
			
	}	
	@AfterTest
	public void close()
	{
		driver.close();
	}
	
	}
	


