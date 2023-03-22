package idiendhya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Individual {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/");
		
		WebElement ele = driver.findElement(By.xpath("//a[.='IND vs SL - Preview']"));
		
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		
		Thread.sleep(2000);
		
		act.moveToElement(ele).perform();
	}

}
