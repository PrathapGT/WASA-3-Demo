package idiendhya;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver ();
		
		driver.get("https://www.cricbuzz.com/");
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		
		File dst=new File("C:\\Users\\home\\Desktop\\New folder.cricbuzz.png");
		
		
		FileUtils.copyFile(src, dst);
	}

}
