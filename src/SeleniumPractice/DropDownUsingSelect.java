package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownUsingSelect 
{

	public static void main(String[] args) 
	{
		WebDriver ms = new ChromeDriver();
		ms.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Select mselect = new Select(ms.findElement(By.id("dropdown-class-example")));
		
		//SelectByVisibleText
		mselect.selectByVisibleText("Option1");
		//SelectByValue
		mselect.selectByValue("option2");
		//SelectByIndex
		mselect.selectByIndex(2);
		
		//We can use deSelect method same as above
		
		mselect.deselectByValue("option2");

	}

}
