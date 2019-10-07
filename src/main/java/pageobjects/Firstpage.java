package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Firstpage {
	public WebDriver driver;
	By signin=By.xpath("//span[contains(text(),'Login')]");
	By text=By.xpath("//h2[contains(text(),'Featured Courses')]");
	By links=By.cssSelector(".nav.navbar-nav.navbar-right");
	
	public Firstpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}



	public WebElement getLogin()
	{
		return driver.findElement(signin);
		
		
	}
	
  public WebElement getTitle()
  {
	  return driver.findElement(text);
  }
  public WebElement getlink()
  {
	  return driver.findElement(links);
  }
}