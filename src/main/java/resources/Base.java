package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException
	{
		
	prop=new Properties();
	
	String path = System.getProperty("user.dir")+"/src/main/java/resources/data.properties";
			FileInputStream fis=new FileInputStream("C:\\Users\\Abhishek\\eclipse-workspace\\E2EProject\\src\\main\\java\\resources\\data.properties");
	
	prop.load(fis);
	String browserName=prop.getProperty("browser");
	System.out.println(browserName);
	if (browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Workarea\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	else if (browserName.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Workarea\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	}
	public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(source,new File(destinationFile));
		return destinationFile;


	}
}
