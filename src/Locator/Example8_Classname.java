package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example8_Classname 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("file:///C:/Users/anasa/OneDrive/Desktop/Selenium%20Soft/Classname.html");
		
		//enter FN
		driver.findElement(By.className("abc123")).sendKeys("abc");
		
		//enter LN
				driver.findElement(By.className("abc456")).sendKeys("xyz");
	}

}
