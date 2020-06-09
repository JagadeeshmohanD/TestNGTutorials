package Test;

import org.testng.annotations.Test;

public class Day2 {
	
	@Test(groups= {"smoke"})
	public void hello() {
		System.out.println("hello welcome");
	}
	
	@Test
	public void bye() {
		System.out.println("Bye Bye");
	}

}
