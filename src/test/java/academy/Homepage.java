package academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.Firstpage;
import pageobjects.Loginpage;
import resources.Base;

public class Homepage extends Base {
	private static Logger log=LogManager.getLogger(Homepage.class.getName());
	@BeforeTest
	public void firststep() throws IOException
	{
		driver=initializingdriver();
		log.info("driver got intialized");
				
	}
		
	
	@Test(dataProvider="getData")
	public void Firstpagenavigation(String username,String password) throws IOException
	{
		driver.get("https://www.qaclickacademy.com/");
		log.info("landed in the respective url");
		//System.out.println(driver.getTitle());
		Firstpage f= new Firstpage(driver);
		f.getLogin().click();
		log.info("login got clicked");
		Loginpage l=new Loginpage(driver);
	    l.credential1().sendKeys(username);
	    log.info("getting the username info from dataprovider");
		l.credential2().sendKeys(password);
		log.info("getting the username info from dataprovider");
		l.ok().click();
		log.info("hitting the ok button");
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][]data=new Object[2][2];
		data[0][0]="gayathri@yahoo.com";
		data[0][1]="pass123";
		data[1][0]="ravi@yahoo.com";
		data[1][1]="pass456";
		return data;
		
				
	}
	

}
