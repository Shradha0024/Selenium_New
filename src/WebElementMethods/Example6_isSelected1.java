package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example6_isSelected1
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		
		
		//click on creat new account
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
		
		boolean result = driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).isSelected();

		
		System.out.println(result);
		
		if(result)
			{
				System.out.println("Element is selected");
			}
			else
			{
				System.out.println("Element is diselected");
				
			}
	}

}
