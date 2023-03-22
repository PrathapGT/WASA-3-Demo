package idiendhya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
 WebDriver driver=new ChromeDriver();
  
   driver.get("file:///C:/Users/home/Documents/cri.html");
   
   WebElement ele = driver.findElement(By.id("australia"));
    Select sel=new Select(ele);
    //sel.selectByIndex(3);
    sel.selectByValue("m");
    
          
	}

}
