package HandlingOfCustmizedListBox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example2_Select_OctOption_Using_HomeKey 
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
		 
		//step 4A: Nevigate to 1st option using home key
		act.sendKeys(Keys.HOME).perform();
		Thread.sleep(2000);
				
		
		//step 4B: Nevigate to oct option using arrow_down key
		for(int i=0; i<=8; i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(2000);
		}
		//select option using enter key
		act.sendKeys(Keys.ENTER).perform();
		
		
		
	}

}
