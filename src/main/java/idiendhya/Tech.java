package idiendhya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tech {

	public static void main(String[] args) throws Throwable {
WebDriverManager.chromedriver().setup();
  WebDriver driver=new ChromeDriver();
  driver.get("https://www.cricbuzz.com/");
   WebElement ele =driver.findElement(By.xpath("//a[.='Teams']"));
      
   Thread.sleep(3000);
   Actions act=new Actions(driver);
   
   act.moveToElement(ele).perform();
   
	}

}
