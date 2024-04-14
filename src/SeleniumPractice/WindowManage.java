package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowManage {

	public static void main(String[] args) 
	{
		WebDriver ms = new ChromeDriver();
		ms.get("https://rahulshettyacademy.com/AutomationPractice/");
		ms.manage().window().maximize();

	}

}
