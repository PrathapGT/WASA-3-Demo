package idiendhya;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Openavvu {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.get("https://www.cricbuzz.com/"
				);
		
		System.out.println("title of the webpage is:"+driver.getTitle());
		
		Thread.sleep(2000);
		System.out.println("current url of webpage is"+driver.getCurrentUrl());
		
		Thread.sleep(2000);
		System.out.println("page source is"+driver.getPageSource());
		
		
		
		
	}

}
