package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example9_name 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("file:///C:/Users/anasa/OneDrive/Desktop/Selenium%20Soft/name.html");
		
		//enter FN
		driver.findElement(By.name("xyz123")).sendKeys("abc");
		
		//enter LN
				driver.findElement(By.name("xyz456")).sendKeys("xyz");
	}

}
