package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	
	@Test(groups= {"smoke"})
	public void plan() {
		System.out.println("Good");
	}
	@BeforeTest
	public void enrollment() {
		System.out.println("Device enrolled");
	}
	@AfterTest
	public void unenrollment() {
		System.out.println("Device unenrolled");
	}
	@Test(groups= {"basicsmoke"})
	public void basicsmoke() {
		System.out.println("basic smoke executed");
	}

}
