package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_getRowSize 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/anasa/OneDrive/Desktop/Selenium%20Soft/html%20files/Sample5.html");
		driver.manage().window().maximize();
		
//		List<WebElement> allrows = driver.findElements(By.xpath("//table[@id='1234']//tr"));
//		//1. identify specific table first 
//		//2. find multiple matching xpath for multiple row
//		//3.by using'/' make xpath of row /tbody/tr or //tr 
//		
//		int size = allrows.size();
//		
//		System.out.println(size);
		           
		                          //OR
		
		int rowsize = driver.findElements(By.xpath("//table[@id='1234']//tr")).size();
		
		System.out.println(rowsize);
		
		
	}

}
