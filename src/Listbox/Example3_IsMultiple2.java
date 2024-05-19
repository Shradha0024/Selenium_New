package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example3_IsMultiple2 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		

		driver.get("file:///C:/Users/anasa/OneDrive/Desktop/Selenium%20Soft/html%20files/Sample6_MultiselectListbox.html");	
		
		
		WebElement selectcountry = driver.findElement(By.xpath("//select[@id='1234']"));
		
		Select s= new Select(selectcountry);
		
		boolean result = s.isMultiple();
		System.out.println(result);
		
		if(result)
		{
			System.out.println("Listbox is multiselectable");
		}
		else
		{
			System.out.println("Listbox is singleselectable");
		}
	}

}
