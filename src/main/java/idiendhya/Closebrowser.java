package idiendhya;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Closebrowser {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(200);
		
		driver.get("https://www.cricbuzz.com");
		
		Thread.sleep(2000);
		
		driver.get("https://www.espncricinfo.com");
		
		
		
		driver.quit();
	}

}
