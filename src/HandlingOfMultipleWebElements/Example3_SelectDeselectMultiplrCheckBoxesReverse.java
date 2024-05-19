package HandlingOfMultipleWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_SelectDeselectMultiplrCheckBoxesReverse 
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
			
			Thread.sleep(500);		
			}
		
		//to deselect check boxes
		for(int i=allcheckboxes.size()-1; i>=0; i--)
		{
			allcheckboxes.get(i).click();
			Thread.sleep(500);
		}
		
	}

}
