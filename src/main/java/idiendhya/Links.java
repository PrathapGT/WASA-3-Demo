package idiendhya;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		WebElement link=driver.findElement(By.xpath("//a[.='Live Scores']"));
		
		link.sendKeys(Keys.ENTER);
		
		
		
		
				
	}

}
