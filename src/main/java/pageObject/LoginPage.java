package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
public WebDriver driver;
By Username=By.id("user_email");
By Password=By.id("user_password");
By button =By.name("commit");

public LoginPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}

public WebElement getid()
{
return driver.findElement(Username);
}

public WebElement getpwd()
{
return driver.findElement(Password);
}

public WebElement submit()
{
return driver.findElement(button);
}
}