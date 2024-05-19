package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Example1_TakescreenshotofWebPage //take screenshot of web page and screenshot of next page after click on next link 
{
	
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		
		File dest=new File("C:\\Users\\anasa\\OneDrive\\Desktop\\Sceenshot\\abc.jpg");
		                      //if we give same file name to differ screen shot then it will discard old and save new
		
		FileHandler.copy(src, dest);
		
	
		//click on create new acc sc
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
		
		File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		
		File dest1=new File("C:\\Users\\anasa\\OneDrive\\Desktop\\Sceenshot\\abc1.jpg");
		                     
		
		FileHandler.copy(src1, dest1);
		
		
		
	}

}
