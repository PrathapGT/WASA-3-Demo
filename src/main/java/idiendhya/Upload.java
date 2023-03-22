package idiendhya;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.foundit.in/");
		
		driver.findElement(By.className("heroSection-buttonContainer_secondaryBtn__text")).click();
		
		WebElement browser = driver.findElement(By.xpath("//input[@id='file-upload']"));
		
		Thread.sleep(6000);
browser.sendKeys("‪C:\\Users\\home\\OneDrive\\Documents\\prathap\\Resume.docx");
System.out.println("resume uploaded successfully");
		
		
		
		
	}

}
