package idiendhya;

import org.testng.annotations.Test;

public class Samescriptmultiple {

	
	
	
	@Test(invocationCount=3)
	
	public void createcontact() {
		System.out.println("contact is created");
	}
	
	@Test(enabled=false)
	
	public void deletecontact() {
		
		System.out.println("contact is deleted");
	}
}
