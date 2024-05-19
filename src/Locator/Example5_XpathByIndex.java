package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example5_XpathByIndex 
{
	public static void main(String[] args) throws InterruptedException 
	{
       WebDriver driver=new ChromeDriver();
		
		driver.get("https://facebook.com/");
		
		
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
		
		//enter FN
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("abc");
		
		//Enter SN
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("xyz");
		
		//Enter Mob no
				driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("8855224466");
						

		
	}

}
