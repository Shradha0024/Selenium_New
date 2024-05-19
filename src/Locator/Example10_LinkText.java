package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example10_LinkText 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("file:///C:/Users/anasa/OneDrive/Desktop/Selenium%20Soft/linktest_partialLinktest.html");
		
		//click on facebook link
		driver.findElement(By.linkText("facebook")).click();
		
		
	}

}
