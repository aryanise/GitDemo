package Acadamy.E2EProject;
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
public class HomepageTest extends Base {
	private static Logger Log = LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initializtion() throws IOException
	{
		driver=initializeDriver();
		Log.info("Browser initialised successfully");
	}
	
	@Test (dataProvider="getData")
	public void homepage(String usernsame, String pwd) throws IOException
	{

		
		driver.get(prop.getProperty("url"));
	
		LandingPage lp=new LandingPage(driver);
		
			lp.getLogin().click();
		
		LoginPage log=new LoginPage(driver);
		
			log.getid().sendKeys(usernsame);
			log.getpwd().sendKeys(pwd);
		
			log.submit().click();
			Log.info("login page validated");
	}	
	
	@AfterTest
	public void close()
	{
		driver.close();
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][]data=new Object[2][2];
		
		data[0][0]="norestricted@gmail.com";
		data[0][1]="1234";
		
        data[1][0]="restricted@gmail.com";
		data[1][1]="66545";

		return data; 
	}
	
}


