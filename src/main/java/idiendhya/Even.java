package idiendhya;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Even {

	
		public static void main1(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();

			 WebDriver driver=new ChromeDriver();
			  driver.get("file:///C:/Users/home/Documents/cri.html");
			  
			 WebElement ele = driver.findElement(By.id("australia"));
			 
			   Select sel=new Select(ele);
			   
			   List<WebElement> options = sel.getOptions();
			   
			   int count = options.size();
			   
			   System.out.println(count);
			   for(int i=0;i<count;i=i+2) {
				   sel.selectByIndex(i);
				   Thread.sleep(2000);
				   sel.deselectAll();
				
	}
		}
}
