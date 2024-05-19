package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_AlertPopUp1 
{
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("abc");
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	
	//get text from alert popup
	String text = driver.switchTo().alert().getText();
	System.out.println(text);
	
	//click on cancle button on alert pop up
	//driver.switchTo().alert().dismiss();
	
	//click on on "ok" button on alert pop up
	driver.switchTo().alert().accept();
	
	//click on ok  button from 2nd alert pop up
	driver.switchTo().alert().accept();
	
}

}
