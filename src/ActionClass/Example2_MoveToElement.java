package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example2_MoveToElement //(just move cursor on element )
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath("//a[@title='Login']"));
		
		
		Actions act=new Actions(driver);
		
		
		
		act.moveToElement(login).perform();
		
		
		Thread.sleep(2000);
		
		
	}

}
