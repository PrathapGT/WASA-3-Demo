package idiendhya;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Perform {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();

		  WebDriver driver=new ChromeDriver();

		  driver.get("https://www.google.com");
		  
		  Thread.sleep(2000);
		  
		  Dimension di=new Dimension(100, 300);
		  driver.manage().window().setSize(di);
		  Thread.sleep(200);
		  Point p=new Point(300, 200);
		  driver.manage().window().setPosition(p);
		  Thread.sleep(2000);
		  driver.manage().window().maximize();
	}

}
