package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example6_Maximize 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://flipkart.com/");
		
		Thread.sleep(2000);
		
//		//3 steps performed
//		Options s1 = driver.manage();//1. call web driver method manage which return options interface output which store in s1
//		
//		Window  s2 = s1.window();//2.Call options interface method window which return window interface output and store in object s2 
//		
//		s2.maximize(); // call s2 ie maximize method
//		
		driver.manage().window().maximize();
		
		 
	}


}
