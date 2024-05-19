package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example4_getFirstSelectOptionFrom_MultiSelectableListbox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/anasa/OneDrive/Desktop/Selenium%20Soft/html%20files/Sample6_MultiselectListbox.html");

		WebElement selectcountry = driver.findElement(By.xpath("//select[@id='1234']"));
		
		Select s= new Select(selectcountry);
		
		s.selectByIndex(0); 
		s.selectByIndex(1); 
		s.selectByIndex(3); 
		
		String text = s.getFirstSelectedOption().getText();
		System.out.println(text);
		
	}

}
