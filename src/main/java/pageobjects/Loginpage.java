package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	public WebDriver driver;
	By username=By.id("user_email");
	By password=By.id("user_password");
	By submit=By.name("commit");
	


public Loginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	}

public WebElement credential1()
{
   return driver.findElement(username);
}
public WebElement credential2()
{
	return driver.findElement(password);
}
public WebElement ok()
{
	return driver.findElement(submit);
}

}