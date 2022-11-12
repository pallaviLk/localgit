package Parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class firefox_parallel
{
	public static WebDriver driver;
	@BeforeMethod()
	public void oppenapp()
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void script() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("1234");
		Thread.sleep(2000);
	}
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}


}
