package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_getColumnSize 
{
	
		public static void main(String[] args) 
		{
			WebDriver driver = new ChromeDriver();
			driver.get("file:///C:/Users/anasa/OneDrive/Desktop/Selenium%20Soft/html%20files/Sample5.html");
			driver.manage().window().maximize();
			
			int columnsize = driver.findElements(By.xpath("//table[@id='1234']//tr[2]/td")).size();
			//1. identify specific table first 
			//2. find multiple matching xpath for multiple row
			//3.by using'/' make xpath of row /tbody/tr or //tr then find which row size want suppose 2 it will highlite 2nd row
			//now we want 2nd row size for that expand tr and td is immediate child it highlited 2nd row all cloumn muliple match
		
			
			System.out.println(columnsize);
			
			
			//for header
			int columnsize1 = driver.findElements(By.xpath("//table[@id='1234']//tr[1]/th")).size();
			
			System.out.println(columnsize1);
			
		}
		
	

}
