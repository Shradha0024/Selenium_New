package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example11_PartialLinkText 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("file:///C:/Users/anasa/OneDrive/Desktop/Selenium%20Soft/linktest_partialLinktest.html");
		
		Thread.sleep(2000);
		
		//click on facebook link
		driver.findElement(By.partialLinkText("book")).click();
		
		
	}

}
