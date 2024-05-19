package HandlingOfAutoSuggetions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
		
		Thread.sleep(2000);
		
		
		//To find multiple matching xpath identify any one option then to 1st navigate to parent element use upkey of keyboard & go upword and stop where all elements/options highlited
	   //where all option highlited from there take tagname of parent and attribute and attribute value
	  //Now to navigate from parent to immediate child use absoulute xpath using songle '/' 
	 //from child take tagname 
		
	List<WebElement> alloptions = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
	
	String expectext="redmi 12 5g";
	
	for(WebElement s1:alloptions)
	{
		String acttext = s1.getText();
		
		if(acttext.equals(expectext))
		{
			s1.click();
			break;
		}
	}
	
	
		
	}

}
