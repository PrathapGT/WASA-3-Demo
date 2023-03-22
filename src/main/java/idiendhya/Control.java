package idiendhya;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Control {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/home/Documents/pro.html");
		
		WebElement ele=driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(2000);
		ele.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(200);
		ele.sendKeys(Keys.DELETE);
	}

}
