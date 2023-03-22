package idiendhya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertionsss {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("login")).click();
		
		String value = driver.getTitle();
		System.out.println(value);
		
		SoftAssert sa=new SoftAssert();
		
		sa.assertEquals(value, "Facebook-log in or sign up");
		System.out.println("1");
		
sa.assertEquals(1, 2);
	}

}
