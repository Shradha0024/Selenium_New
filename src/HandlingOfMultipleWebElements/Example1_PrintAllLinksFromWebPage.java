package HandlingOfMultipleWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_PrintAllLinksFromWebPage 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		                            //selectfindelements
	List<WebElement> allLinks =driver.findElements(By.xpath("//a"));
    //'a' tagname use to identify link.Acc to Relative xpath to jump from parent to any child use '//' means all the links present in webpage with tagname a it will identify all 
		
	
	System.out.println(allLinks.size());
	
		for(WebElement s1:allLinks)
		{
			System.out.println(s1.getText());
		}
		
	}


}
