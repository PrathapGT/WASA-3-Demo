package idiendhya;

import org.testng.annotations.Test;

public class Annotationsss {

	@Test(priority=1)
	
	
	public void createcontact() {
		System.out.println("contact is created");
	}
	@Test(priority=2)
	
	public void modifycontact() {
		
		System.out.println("contact is modified");
	}
	@Test(priority=3)
	
	public void deletecontact() {
		
		System.out.println("contact is deleted");
	}
	
}
