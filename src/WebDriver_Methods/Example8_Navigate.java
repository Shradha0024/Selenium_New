package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example8_Navigate 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		//driver.get("https://flipkart.com/");
		
		driver.navigate().to("https://flipkart.com/");
		Thread.sleep(2000);
		
		driver.navigate().to("https://google.com/");
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);

		driver.navigate().forward();
		Thread.sleep(2000);

		driver.navigate().refresh();

	}

}
