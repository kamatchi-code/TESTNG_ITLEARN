package TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



	public class Signin {
	public static WebDriver driver;
	
	@BeforeClass

	public static void beforcla(){
		System.out.println("before class");
		// TODO Auto-generated method stub
		 driver=new ChromeDriver();
		 driver.get("https://www.itlearn360.com/");
	}
	@Test
	 
	    public void test() throws InterruptedException {
	    	WebElement sign = driver.findElement(By.xpath("//span[contains(text(),'Sign in?')]"));
			sign.click();
			driver.manage().window().fullscreen();
			Thread.sleep(2000);
			
			//user sign in
			WebElement element = driver.findElement(By.id("user_login"));//positive test case
			element.sendKeys("KAMATCHI11");
			Thread.sleep(2000);
	 }
			
		@Test
		
	    public void test1() throws InterruptedException {
	    	WebElement element2 = driver.findElement(By.id("user_pass"));//positive test case
			element2.sendKeys("KAMATCHI456$");
			WebElement element3 = driver.findElement(By.name("wp-submit"));
			element3.click();
			driver.manage().window().maximize();
		
	    	Thread.sleep(2000);

}
				
		@AfterClass
		public static void aftercla(){
			driver.quit();
			// TODO Auto-generated method stub
			System.out.println("after class");
		
	
	}
	}
	
	
