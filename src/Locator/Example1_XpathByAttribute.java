package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_XpathByAttribute
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://facebook.com/");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ABC");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}

}
