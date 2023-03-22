package idiendhya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertionss {

	@Test
	
	public void test1() throws Throwable{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.name("username")).sendKeys("dprathap529@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("Positive@29");
		
		driver.findElement(By.xpath("//button[.='Log in']")).click();
		
		
		String expectedresult="Instagram";
		
		String actualresult=driver.getTitle();
		
		
		Assert.assertEquals(actualresult, expectedresult);
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
	}
	
	
	
	
}
