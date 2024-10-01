package TESTNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dataprovider1 extends Base_Demo1 {
	@Test(dataProvider="login")
	private void test(String user,String pass) throws InterruptedException {
		BrowserLaunch();
		Url("https://www.itlearn360.com/");
		Signin_POM s= new Signin_POM(driver);
		Thread.sleep(2000);
		Click(s.getSign());
		Thread.sleep(2000);
		Sendkeys(s.getUser(), user);
		Sendkeys(s.getPass(), pass);
		Thread.sleep(2000);
		Click(s.getLogin());
		Logout_POM s1= new Logout_POM(driver);
		Click(s1.getLogout());
		Quit();
		
	}
	
	@org.testng.annotations.DataProvider(name="login")
	public String[][] data(){
		
		return new String[][] {
			{"KAMATCHI11","KAMATCHI456$"},
			{"KAMATCHI11","Test@123"},
			{"Test1234","KAMATCHI456$"},
			{"KAMATCHI11","KAMATCHI456$"}
		};	

		

		

		

		

	}}

