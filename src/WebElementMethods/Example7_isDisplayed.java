package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example7_isDisplayed 
{
	
		
		public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://facebook.com/");
			
			boolean result = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
			System.out.println(result);
			
			if(result)
			{
				System.out.println("logo present");
			}
			else
			{
				System.out.println("logo not present");
				
			}
		}

		
		
	

}
