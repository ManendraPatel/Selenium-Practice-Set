package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver ms = new ChromeDriver();
		ms.get("https://rahulshettyacademy.com/AutomationPractice/");
		ms.findElement(By.id("confirmbtn")).click();
		
		Thread.sleep(2000);
		
		//Alert Text
		String alerttext =ms.switchTo().alert().getText();
		System.out.println(alerttext);
		
		//Accept
		ms.switchTo().alert().accept();
		
		//Dismiss or cancel
		ms.switchTo().alert().dismiss();
		
		//
		ms.switchTo().alert().sendKeys("MS Ji");
	}

}
