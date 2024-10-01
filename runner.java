
package TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pomitlearn.demo.Logout_POM;
import pomitlearn.demo.Signin_POM;

public class runner extends  Base_Demo1 {
	
	//public static WebDriver driver=BrowserLaunch();
	
	@BeforeClass
	   private static void Method1() {
		 driver=new ChromeDriver();
		 driver.get("https://www.itlearn360.com/");
		 driver.manage().window().maximize();
	}
		
	
	@Test(description = "Welcome")
	private void Method2() {
		Signin_POM s= new Signin_POM(driver);
		Url("https://www.itlearn360.com/");
		Click(s.getSign());
		Sendkeys(s.getUser(),"KAMATCHI11");
		Sendkeys(s.getPass(),"KAMATCHI456$");
		Click(s.getLogin());

	}
	
	   	
	@AfterMethod
	   private void Method3() {
		   Logout_POM s1= new Logout_POM(driver);
			Click(s1.getLogout());
			
			driver.quit();
		   

	}
		
	}


