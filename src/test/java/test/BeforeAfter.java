package test;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BeforeAfter {
	public static WebDriver driver;
	Logger logger=Logger.getLogger(BeforeAfter.class);
	
	
	@BeforeSuite
	public void openBrowser(){
		PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
		driver=new ChromeDriver();
		logger.info("Chrome browser opened");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		logger.info("Browser maximized");
		driver.get("http://www.flipkart.com/");
	}
	
	@AfterSuite
	public void closeBrowser(){
		
	}

}
