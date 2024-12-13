package projects;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitclass {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		
		driver.get("https://www.facebook.com");
	}
	@Test
	public void titleVerification()
	{
		String ActualTitle=driver.getTitle();
		String ExpectedTitle="FACEBOOK";
		if(ActualTitle.equals(ExpectedTitle))
		{
			System.out.println("Title is expected");
		}
		else {
			System.out.println("Title is different");
		}
	}
	@After
	public void close()
	{
		driver.quit();
	}

}
