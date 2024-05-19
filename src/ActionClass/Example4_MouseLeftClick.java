package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example4_MouseLeftClick 
{
	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		WebElement cart = driver.findElement(By.xpath("//a[text()='Cart']"));
		
	
	Actions act=new Actions(driver);
	
	
//	act.moveToElement(cart).perform();
//	//select action class method moveToElement
//	
//	act.click().perform();
	
	
//	act.moveToElement(cart).click().perform();
	
	act.click(cart).perform();	
	}

}
