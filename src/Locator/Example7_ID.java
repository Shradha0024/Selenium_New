package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example7_ID 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("file:///C:/Users/anasa/OneDrive/Desktop/Selenium%20Soft/ID.html");
		
		//enter FN
		driver.findElement(By.id("1234")).sendKeys("abc");
		
		//enter LN
				driver.findElement(By.id("5678")).sendKeys("xyz");
	}
		

}
