package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_Clear 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
//		
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Abc");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='email']")).clear();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xyz");

		WebElement UN = driver.findElement(By.xpath("//input[@id='email']"));
		UN.sendKeys("abc");
		Thread.sleep(2000);
		UN.clear();
		Thread.sleep(2000);
		UN.sendKeys("xyz");
		
	}

}
