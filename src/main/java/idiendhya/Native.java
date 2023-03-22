package idiendhya;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Native {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();

		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("history");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.cricbuzz.com/");
		
		
	}

}
