package test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestUtils extends BeforeAfter{
	
	public static void mouserHoverAction(WebElement ele){
		Actions action=new Actions(driver);
		action.moveToElement(ele).build().perform();
	}

}
