package seleniumprojects;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandling {
	ChromeDriver driver=new ChromeDriver();
	
	@Before
	public void setup() {
		driver.get("file:///C:/Users/akash/OneDrive/Desktop/office2024/Alert.html");
		
	}
	@Test
	public void alertpgm() {
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Alert a=driver.switchTo().alert();
		a.getText();
		a.accept();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sona");
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("suresh");
		
	}

}
