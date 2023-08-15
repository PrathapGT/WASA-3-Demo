package idiendhya;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver ();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("dprathap529@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("Positive@29");
		
		
		driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
		
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		
		File dst=new File("‪C:\\Users\\home\\Desktop\\New folder.insta.png");
		
		
		FileUtils.copyFile(src, dst);
	}

}
