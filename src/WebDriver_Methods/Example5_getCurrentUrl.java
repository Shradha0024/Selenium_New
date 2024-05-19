package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example5_getCurrentUrl 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://flipkart.com/");
		
		String url = driver.getCurrentUrl();
		//getCurrentUrl method is use to get current url of web page and the return type is string
		System.out.println(url);
		
	}

}
