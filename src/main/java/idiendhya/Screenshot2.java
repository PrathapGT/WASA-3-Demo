package idiendhya;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot2 {

	public static void main(String[] args) throws Throwable {

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://web.whatsapp.com/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File("‪‪C:\\Users\\home\\Desktop\\New folder.whatsapp.png");
		Thread.sleep(2000);
		
		FileUtils.copyFile(src, dst);

	}

}
