package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
public WebDriver driver;
By Signin=By.xpath("//*[text()='Login']");
By title =By.xpath("//section[@id='content']/div/div/h2");
By navdisplay=By.xpath("//ul[@class='nav navbar-nav navbar-right']");

public LandingPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}

public WebElement getLogin()
{
return driver.findElement(Signin);
}

public WebElement gettitle()
{
return driver.findElement(title);
}

public WebElement getnavigate()
{
return driver.findElement(navdisplay);
}

}