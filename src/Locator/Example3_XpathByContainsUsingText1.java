package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_XpathByContainsUsingText1 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://facebook.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
		
	}

}
