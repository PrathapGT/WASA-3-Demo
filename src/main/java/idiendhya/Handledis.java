package idiendhya;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handledis {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com");
		
		Thread.sleep(5000);
JavascriptExecutor js=(JavascriptExecutor) driver;

		for(int i=0;i<3;i++) {
			
			js.executeScript("window.scrollBy  (0,500)" );
			Thread.sleep(2000);
			
		}
		for(int i=0;i<3;i++) {

			js.executeScript("window.scrollBy  (0,-500)" );

	}
	}
}
