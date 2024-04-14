package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DropDown {
@Test(priority=1)
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver ms = new ChromeDriver();
	
		ms.get("https://rahulshettyacademy.com/AutomationPractice/");
		ms.findElement(By.id("autocomplete")).sendKeys("ind");
		Thread.sleep(2000);
		
		List <WebElement> countrylist=ms.findElements(By.xpath("//ul[@id=\"ui-id-1\"]//li[@class=\"ui-menu-item\"]"));
		
		//System.out.println(countrylist);
		
		for(WebElement list : countrylist)
		{
			if(list.getText().equals("India"))
			{
				
				System.out.println("Printed : "+list.getText());
				list.click();
				break;
			}
		}

	}

}
