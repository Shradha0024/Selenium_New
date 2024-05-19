package HandlingOfMultipleWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_SelectMultipleCheckBoxes 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\anasa\\OneDrive\\Desktop\\Selenium Soft\\html files\\Multiplecheckboxex1.html");
		
		                                       //selectfindelements
		List<WebElement> allcheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println(allcheckboxes.size());
		
	
		// to click on all checkboxes
		for(WebElement s1: allcheckboxes)
		{
			s1.click();
			
			Thread.sleep(2000);		
			}
		
//		//to click on 5 check boxes
//		for(int i=0; i<=4; i++)
//		{
//			allcheckboxes.get(i).click();
//		}
//		
	}

}
