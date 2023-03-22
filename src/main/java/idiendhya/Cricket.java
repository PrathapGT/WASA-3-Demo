package idiendhya;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cricket {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File("C:\\Users\\home\\Desktop\\New folder\\cricbuzz.png");
		
		FileUtils.copyFile(src, dst);
	}

}

