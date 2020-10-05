package Acadamy.E2EProject;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

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
public class verifynavigation extends Base {
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
		
			assertTrue(lp.getnavigate().isDisplayed(), "items are displaying");
			Log.info("item displaying sucessfully");
	}	
	@AfterTest
	public void close()
	{
		driver.close();
	}
	
	
	}
	


