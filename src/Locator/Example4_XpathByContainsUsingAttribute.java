package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4_XpathByContainsUsingAttribute 
{
	public static void main(String[] args) 
	{
       WebDriver driver=new ChromeDriver();
		
		driver.get("https://facebook.com/");
		
		
		//enter UN
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email')]")).sendKeys("ABC");
		
		//enter PW
		driver.findElement(By.xpath("//input[contains(@class,'6luy _9npi')]")).sendKeys("XYZ");
				
		//click login button
		driver.findElement(By.xpath("//button[contains(@class,'selected _51sy')]")).click();
						

		
	}


}
