package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_SwitchToMainPageFromFrame 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//switch to frame                           
		driver.switchTo().frame("iframeResult");      //1.String frameID
		
		//click on "click me buton"
        driver.findElement(By.xpath("//button[contains(text(),'Click me to')]")).click();		
        
        
        //Switchh to main page- 2 ways
        //driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        
        //click om"open menu" option from main page
      //driver.switchTo().parentFrame();
                    //OR
        driver.switchTo().defaultContent();
        
        
           Thread.sleep(2000);
        
        //click on "open menu" option from main page
         driver.findElement(By.xpath("//a[@id='menuButton']")).click();
        
        
        
	}
	

}
