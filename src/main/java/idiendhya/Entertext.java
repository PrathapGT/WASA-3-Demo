package idiendhya;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Entertext {

	public static void main(String[] args) throws Throwable {
WebDriverManager.chromedriver().setup();
 
    WebDriver driver=new ChromeDriver();
    
    driver.get("file:///C:/Users/home/Documents/ind.html");
    
    Thread.sleep(3000);
    
   JavascriptExecutor js=(JavascriptExecutor) driver;
   
   js.executeScript("document.getElementById('t1').value='kgp'" );
	}

}
