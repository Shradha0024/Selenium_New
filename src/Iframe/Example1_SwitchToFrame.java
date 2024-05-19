package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_SwitchToFrame 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//switch to frame                           //to switch into frame 4ways
		
		//driver.switchTo().frame("iframeResult");      //1.String frameID
	
		//driver.switchTo().frame("iframeResult");      //2.String framrname
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));//3.string frameweb element
		
		//driver.switchTo().frame();//4. int frame index
		
		
		//click on "click me buton"
          driver.findElement(By.xpath("//button[contains(text(),'Click me to')]")).click();		
	}

}
