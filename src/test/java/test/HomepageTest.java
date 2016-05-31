package test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pages.Homepage;

public class HomepageTest extends BeforeAfter{

	@Test
	public void printingAllHeaderLinks(){
		Homepage homepage=new Homepage(driver);
		TestUtils.mouserHoverAction(homepage.manLink);
	}
	
}
