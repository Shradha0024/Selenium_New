package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_CloseMethod 

{
	public static void main(String[] args) throws InterruptedException 
	{                                    //throws is use to handle exception 
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com/");
		
		Thread.sleep(4000);//4sec//2000=2sec //just to add time betn open and close of url
		//thread inbuild class present in java.lang which has ststic method sleep 
		
		driver.close();
	}

}
