package idiendhya;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Teams {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
 
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.cricbuzz.com/");

		 WebElement ele = driver.findElement(By.id("teamDropDown"));
		 Thread.sleep(2000);
Actions act=new Actions	(driver); 
		 act.moveToElement(ele).perform();
		
		
			
		}
		 
		 

	}


