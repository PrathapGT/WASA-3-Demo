package idiendhya;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup2 {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/mnjuser/homepage");
		
		String parent_id=driver.getWindowHandle();
		
		System.out.println(parent_id);
		
		Set<String> allid=driver.getWindowHandles();
		int count=allid.size();
		System.out.println(count);
		
		for(String a:allid) {
			
			driver.switchTo().window(a);
			
			String title=driver.getTitle();
			System.out.println(title);
			
			driver.close();
		}
	}

}

