package idiendhya;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.foundit.in/");
		
		driver.findElement(By.className("heroSection-buttonContainer_secondaryBtn__text")).click();
		
		WebElement browser = driver.findElement(By.xpath("//input[@id='file-upload']"));
		
		Thread.sleep(3000);
		
		browser.sendKeys("‪C:\\Users\\home\\Downloads\\prathap p.apps.docx");
		
		driver.findElement(By.id("pop_upload")).click();
System.out.println("resume uploaded successfully");
		
		
		
		
	}

}
