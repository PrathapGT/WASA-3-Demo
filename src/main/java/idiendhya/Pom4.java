package idiendhya;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom4 {

@FindBy(xpath="//button[.='Log in']")	
	private WebElement Loginbtn;
	
	
		
	public WebElement getLoginbtn() {
		return Loginbtn;
		
	}



	public Pom4(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	 
	
	
public void login() {
	
	
	Loginbtn.click();

}

		
	
		
	}
		
	

	
	
	

