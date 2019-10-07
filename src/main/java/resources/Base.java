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
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

public static WebDriver driver;
public Properties prop;	
public WebDriver initializingdriver() throws IOException

	{
	
	Properties prop=new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\gay3v\\e2eproject\\src\\main\\java\\resources\\info.properties");
	prop.load(fis);
	String browserName=prop.getProperty("browser");
	System.out.println(browserName);
	if(browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	else if(browserName.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\auto\\geckodriver.exe");
	     driver=new FirefoxDriver();
	}
	else if(browserName.equals("ie"))
	{
		System.setProperty("webdriver.ie.driver", "C:\\auto\\iedriver.exe");
		driver=new EdgeDriver();
	}
  
   //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
   return driver;
	}
   public void getscreenshot(String result) throws IOException
   {
	  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(src, new File("C://Test//"+result+"screenshot.png"));
	  
   }

}