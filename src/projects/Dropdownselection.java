package projects;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownselection {
	ChromeDriver driver=new ChromeDriver();
	
	@Before
	public void setup() {
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void dropDown() {
		WebElement day=driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]"));
		Select daydetails=new Select(day);
		daydetails.selectByValue("06");
		WebElement monthdetails=driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]"));
		Select month=new Select(monthdetails);
		month.selectByValue("08");
		WebElement yeardetails=driver.findElement(By.xpath("//select[contains(@name,'DOB_Year')]"));
		Select year=new Select(yeardetails);
		year.selectByValue("1983");
		driver.findElement(By.xpath("//*[@id='mobno']")).sendKeys("9544005335");
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("sona suresh");
		
	}

}
