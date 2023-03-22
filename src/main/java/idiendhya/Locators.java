package idiendhya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.internal.MouseAction.Button;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("dprathap529@gmail.com");
		
		driver.findElement(By.name("pass")).sendKeys("Positive@29");
		
		

	
	

	
	}

}
