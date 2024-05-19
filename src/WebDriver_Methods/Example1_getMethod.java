package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_getMethod 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com/");
		
	}

}
