package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example5_getsizeofallSelectedOptionFromMultiSelectableListbox 
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
		
		
		
//		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
//		System.out.println(allSelectedOptions.size());
	//	System.out.println(text);
                     //OR
		
		int size = s.getAllSelectedOptions().size();
		System.out.println(size);
		
		
	}

}
