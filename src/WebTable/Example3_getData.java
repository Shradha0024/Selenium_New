package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_getData 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/anasa/OneDrive/Desktop/Selenium%20Soft/html%20files/Sample5.html");
		driver.manage().window().maximize();
		
		
		String text = driver.findElement(By.xpath("//table[@id='1234']//tr[3]/td[3]")).getText();
		
		System.out.println(text);
		
		
		//for header
		
        String text1 = driver.findElement(By.xpath("//table[@id='1234']//tr[1]/th[3]")).getText();
		
		System.out.println(text1);
		
		
	}

}
