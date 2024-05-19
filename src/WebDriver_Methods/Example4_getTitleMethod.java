package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4_getTitleMethod 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://flipkart.com/");
		
		String title = driver.getTitle();
		//get method is use to get title of web page and the return type is string
		System.out.println(title);
		
	}

}
