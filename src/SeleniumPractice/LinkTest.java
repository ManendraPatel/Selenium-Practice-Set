package SeleniumPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest {

	public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException 
	{
		WebDriver ms=new ChromeDriver();
		ms.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement msl = ms.findElement(By.xpath("//div[@id='gf-BIG']"));
		List <WebElement> list = msl.findElements(By.tagName("a"));
		Thread.sleep(2000);
		
		for(WebElement lst:list)
		{
			String url=lst.getAttribute("href");
			HttpURLConnection conn= (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int responsecd= conn.getResponseCode();
			//System.out.println(responsecd);
			if (responsecd > 400)
			{
				System.out.println(lst.getText()+" :<<<Broken URLs");
			}
			
		}
	}

}
