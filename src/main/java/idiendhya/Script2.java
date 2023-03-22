package idiendhya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://training.orangehrm.com/");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//input[@name='txtUsername']"));
		
		boolean value = ele.isDisplayed();
		System.out.println(value);
		if(value) {
			System.out.println("textbox is displayed");
		}
		else {
			System.out.println("textbox is not displayed");
		}
	}

}
