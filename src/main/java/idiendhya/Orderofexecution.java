package idiendhya;

import org.testng.annotations.Test;

public class Orderofexecution {

	@Test
	
	public void createcontact() {
		
		System.out.println("contact is created");
	}
	@Test(dependsOnMethods="createcontact")
	
	public void modifycontact() {
		System.out.println("contact is modified");
	}
	
	@Test(dependsOnMethods="modifycontact")
	
	public void deletecontact() {
		
		System.out.println("contact is deleted");
	}
}
