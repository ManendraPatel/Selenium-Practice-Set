package TestNGPractice;
import org.testng.annotations.Test;

public class Anotations 
{
	@Test(priority=1)
	public void First()
	{
	System.out.println("First Program");
	}
	@Test(priority=0)
	public void Priority()
	{
		System.out.println("Priority example");
		
	}
	
}
