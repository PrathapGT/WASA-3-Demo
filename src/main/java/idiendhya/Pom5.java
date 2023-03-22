package idiendhya;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom5 {

	@FindBy(name="login")
	
	private WebElement Loginbtn;
	
	
	@FindBy(id="email")
	
	private WebElement emailf;
	
	
	
	@FindBy(id="pass")
	
	private WebElement passf;
	
	
	public Pom5(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void login() throws Throwable {
		
		emailf.sendKeys("abc");
		
		Thread.sleep(2000);
		
		passf.sendKeys("bca");
		
		
		Loginbtn.click();
	}
	
}
