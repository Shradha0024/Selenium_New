package HandlingodDynamicElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_getReviewsFromFlikartApp 
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
		
		//get review
		String reviews = driver.findElement(By.xpath("((//div[@class='tUxRFH'])[1]//span)[8]")).getText();
		//1. to find xpath od dynamic element 1st find xpath of parent by using up key of keyboard and stop where complete redmi 9 power higlited
		//make xpath of parent find exact match index[1] out of 15 
		//now to find xpath of child element use relative xpath with '//' and tagname if multiple index then take exact matching index 
		System.out.println(reviews);
		
	}

}
