package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) 
	{
		WebDriver ms = new ChromeDriver();
		ms.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		ms.findElement(By.id("opentab"));
		
		Actions msaction = new Actions(ms);
		
		//RightClick
		msaction.contextClick().perform();
		
		//DoubleClick
		msaction.doubleClick().perform();
		//ClickAndHold
		msaction.clickAndHold().perform();
		

	}

}
