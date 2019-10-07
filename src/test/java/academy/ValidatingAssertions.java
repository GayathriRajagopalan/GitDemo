package academy;

import static org.testng.Assert.assertEquals;


import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pageobjects.Firstpage;
import resources.Base;

public class ValidatingAssertions extends Base {
	private static Logger log=LogManager.getLogger(ValidatingAssertions.class.getName());
	@BeforeTest
	public void firststep() throws IOException
	{
		driver=initializingdriver();
		log.info("driver got initialized");
		driver.get("https://www.qaclickacademy.com/");	
		log.info("url got invoked");
	}
	
	
	@Test
	public void Assertions1() throws IOException
	{
		
		Firstpage f=new Firstpage(driver);
		Assert.assertEquals(f.getTitle().getText(), "FEATURED123 COURSES");
		log.debug("validating the text message");
		
			
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
		
	}

}
