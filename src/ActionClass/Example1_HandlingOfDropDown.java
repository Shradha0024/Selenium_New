package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example1_HandlingOfDropDown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		
		
		Thread.sleep(2000);
		

		//step1: select webelement which perform mouseover
		WebElement login = driver.findElement(By.xpath("//a[@title='Login']"));

						
		
		//step2:create object of action class and send driver to constructor i.e. giving control of webdriver object to action class
		//bcoz to perform all mouse related operations
		Actions act=new Actions(driver);
		
		//step3:to perform action
		act.moveToElement(login).perform();
	
		Thread.sleep(2000);
		
		//step4:click on wishlist element
		driver.findElement(By.xpath("//li[text()='Wishlist']")).click();
		
	
	}

}
