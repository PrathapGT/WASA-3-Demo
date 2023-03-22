package idiendhya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("dprathap529@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("Positive@29");
		
		driver.findElement(By.name("login")).click();
		
		//String url=driver.getCurrentUrl();
		//System.out.println(url);
		
		//if(url.equalsIgnoreCase("https://www.instagram.com/accounts/onetap/?next=%2F"))
		//{
		//	System.out.println("home page is displayed");
		//}
		//else {
		//	System.out.println("home page is not displayed");
		//}//
		

		
		
		
			
		}
			
			
		
		
		
		
	}


