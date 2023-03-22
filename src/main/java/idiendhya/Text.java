package idiendhya;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Text {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/");
		List<WebElement> links= driver.findElements(By.tagName("a"));
		
		for(WebElement a:links) {
			
			String value=a.getText();
			System.out.println(value);
		}
			
			
		
	}

}
