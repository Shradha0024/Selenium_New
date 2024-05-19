package HandlingodDynamicElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_getRatingsFromFlikartApp 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//clock on close button if pop of login
		//driver.findElement(By.xpath("")).click();
		
		
		//enter input in search box
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("redmi 9 power");
	
		
		//click on search icon
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		
		//get rating
		String ratings = driver.findElement(By.xpath("((//div[@class='tUxRFH'])[1]//span)[6]")).getText();
		
		System.out.println(ratings);
		
	}

}
