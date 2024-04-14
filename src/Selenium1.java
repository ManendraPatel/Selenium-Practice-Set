
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {

	public static void main(String[] args) 
	{
		
		WebDriver ms = new ChromeDriver();
		ms.get("https://www.google.com/");
		
		//ancestor::*
		
		ms.findElement(By.name("q")).sendKeys("MS Ji");
	//	ms.findElement(By.xpath("//div[@class=\"FPdoLc lJ9FBc\"]//input[@name=\"btnK\"]")).click();
		
		//contains method
		ms.findElement(By.xpath("//div[contains(@class,'FPdoLc lJ9FBc')]//input[@name=\"btnK\"]")).click();
	}

}
