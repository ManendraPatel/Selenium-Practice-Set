package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowManage {

	public static void main(String[] args) 
	{
		WebDriver ms = new ChromeDriver();
		ms.get("https://rahulshettyacademy.com/AutomationPractice/");
		ms.manage().window().maximize(); // Maximize the browser window
		ms.manage().window().fullscreen(); // Set full-screen mode
		ms.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Set implicit wait

	}

}
