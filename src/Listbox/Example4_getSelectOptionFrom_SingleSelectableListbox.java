package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example4_getSelectOptionFrom_SingleSelectableListbox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
       driver.get("https://facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s=new Select(month);
		
//		WebElement selectedoption = s.getFirstSelectedOption();
//		String text= selectedoption.getText();
//		System.out.println(text);
//		                             OR
		
		String text = s.getFirstSelectedOption().getText();
		System.out.println(text);
		
	}

}
