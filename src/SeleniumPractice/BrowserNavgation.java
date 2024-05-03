package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavgation {

	public static void main(String[] args) 
	{
		
		WebDriver ms = new ChromeDriver();	
		
		ms.navigate().to("https://www.google.com/"); // Navigate to a new URL
		ms.findElement(By.name("q")).sendKeys("MS");
		ms.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).click();
		ms.navigate().back(); // Go back to the previous page
		ms.navigate().forward(); // Go forward to the next page
		ms.navigate().refresh(); // Refresh the current page

	}

}
