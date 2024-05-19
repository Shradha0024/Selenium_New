package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example6_Tagname 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("file:///C:/Users/anasa/OneDrive/Desktop/Selenium%20Soft/Tagname.html");
		
		//enter FN
		driver.findElement(By.tagName("input")).sendKeys("abc");
		
		//enter FN
				driver.findElement(By.tagName("input")).sendKeys("xyz");

		
	}

}
