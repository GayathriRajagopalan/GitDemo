package academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageobjects.Firstpage;
import resources.Base;

public class ValidatingNavBar extends Base {
	private static Logger log=LogManager.getLogger(ValidatingNavBar.class.getName());
    @BeforeTest
    public void firststep() throws IOException
    {
    	driver=initializingdriver();
    	log.info("driver got initialized");
		driver.get("http://qaclickacademy.com/");	
		log.info("url got invoked");
    }
	@Test
	public void Assertion2() throws IOException
		{
		
		Firstpage f=new Firstpage(driver);
		Assert.assertTrue(f.getlink().isDisplayed());
		log.debug("validating the Navigation bar");
		
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
		
	}
}
