package HandlingOfCustmizedListBox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//step 1 : identify listbox
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		//step2: create object of action class
		 Actions act=new Actions(driver);
		 
		 //step 3: open list box
		 act.click(month).perform();
		 Thread.sleep(2000);
		 
		//step 4A: Nevigate to option 1 to top using arrow_up key
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		
		
		//step 4B: Nevigate to option 1 to bottom using arrow_down key
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
		
		
		
	}

}
