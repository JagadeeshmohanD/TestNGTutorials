package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Day3 {
	
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("Execute before class execution start");
	}
@Parameters({ "URL","APIKey/Username"})
	 @Test
	    public void mobilelogout(String urlname,String key) {
		System.out.println("mobilelogout");
		System.out.println(urlname);
		System.out.println(key);
	   }
	@AfterClass
	public void afterclass() {
		System.out.println("Execute after class execution start");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before Method Execution before every test in Day 3 class");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("After Method Execution after every test in Day 3 class");
	}
	@Test(groups= {"basicsmoke"})
	public void weblogin(){
		
		//selenium code
		System.out.println("Weblogin");
	}
	@Test(groups= {"smoke"})
	public void mobilelogin() {
		//Appium code
		System.out.println("mobilelogin");
	}
	@Test(timeOut=4000)
	public void mobiledashboard() {
		//Appium code
		System.out.println("mobiledashboard");
	}
	@Test(dataProvider="getData")
	public void mobiledata(String username,String password) {
		//Appium code
		System.out.println("mobiledata");
		System.out.println(username);
		System.out.println(password);
	}	
	@Test(enabled=false)
	public void mobilehomescreen() {
		//Appium code
		System.out.println("mobilehomescreen");
	}
	@Test(groups= {"basicsmoke"})
	public void mobilesplash() {
		//Appium code
	System.out.println("mobilesplash");	
	}
	@BeforeSuite
	public void beforesutite() {
		System.out.println("Beforesuite execution");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("Aftersuite execution");
	}
	
	@Test(dependsOnMethods= {"weblogin"})
	public void APIlogin() {
		//RestAPI code
		System.out.println("APILogin");
	}
	@DataProvider
	public Object[][] getData() {
		//1t combination-username password
		//2nd-username password-no credit history
		//3rd-username password-fraudentl credit history
		Object[][] data = new Object[3][2];
		//1st data
		data[0][0]="firstsetusername";
		data[0][1]="firstpassword";
		//columns in the row are values for that particular combination
		
		//2nd set
		data[1][0]="secondsetusername";
		data[1][1]="secondpassword";	
		
		//3rd set
		data[2][0]="thirdsetusername";
		data[2][1]="secondpassword";
		
		return data;
	}
}
