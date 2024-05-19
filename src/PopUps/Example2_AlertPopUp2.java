package PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_AlertPopUp2 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("111");
		 
		 driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		
		//Create object of alert popUp and use no need to call always driver.switchto().alert();
		Alert alt = driver.switchTo().alert();
		
		//get text from alert popup
		String text = alt.getText();
		System.out.println(text);
		
		//click on cancle button on alert pop up
		//alt.dismiss();
		
		//click on on "ok" button on alert pop up
		alt.accept();
		
		//click on ok  button from 2nd alert pop up
		alt.accept();
		
	}

}
