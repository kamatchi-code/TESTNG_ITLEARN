package TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class itleranTestNG {
	public static WebDriver driver;
	
	
	
	@BeforeClass

	public static void beforcla(){
		System.out.println("before class");
		// TODO Auto-generated method stub
		 driver=new ChromeDriver();
		 driver.get("https://www.itlearn360.com/");
	}
	@BeforeMethod
	 
    public void test() throws InterruptedException {
    	WebElement sign = driver.findElement(By.xpath("//span[contains(text(),'Sign in?')]"));
		sign.click();
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		//user sign in
		WebElement element = driver.findElement(By.id("user_login"));//positive test case
		element.sendKeys("KAMATCHI11");
		Thread.sleep(2000);
 
    	WebElement element2 = driver.findElement(By.id("user_pass"));//positive test case
		element2.sendKeys("KAMATCHI456$");
		WebElement element3 = driver.findElement(By.name("wp-submit"));
		element3.click();
		driver.manage().window().maximize();
	   	Thread.sleep(2000);

}
			@Test
	      private void Method1() throws InterruptedException {
	    	// All courses
				Thread.sleep(3000);
				WebElement element = driver.findElement(By.xpath("//a[@class='cd-dropdown-trigger desktop-navigation btn btn-primary']"));
				element.click();
				
				Thread.sleep(2000);
				
				WebElement element2a = driver.findElement(By.xpath("//span[text()='Code Academy']"));
				Actions acc = new Actions(driver);
				acc.moveToElement(element2a).perform();
				Thread.sleep(2000);
				
				WebElement element9 = driver.findElement(By.xpath("//span[text()='Java for Beginners']"));
				//Actions acc1 = new Actions(driver);
				acc.moveToElement(element9).perform();
				element9.click();
				Thread.sleep(2000);		
				
				//start free trial
				WebElement element10 = driver.findElement(By.xpath("/html/body/div[1]/div/main/div/article/div[2]/div[1]/div/div[3]/div[1]/div[1]/ul/li[6]/a/button"));
				driver.manage().window().fullscreen();
				element10.click();
				Thread.sleep(2000);
				//monthly trial
				WebElement element11 = driver.findElement(By.xpath("/html/body/div[1]/div/main/div/article/div[2]"
						+ "/div[1]/div/div[3]/div[2]/div[2]/div[9]/div/div[1]/div/div/div[1]/div/div[2]/div/form/div/button"));
				driver.manage().window().fullscreen();
				element11.click();
				Thread.sleep(2000);
			}
		
	
	    @AfterMethod
		private void lOGOUT() {
			 WebElement element4 = driver.findElement(By.xpath("//span[text()='Logout']"));
		     element4.click();

		}
	
	
	
	@AfterClass
	public static void aftercla(){
		driver.quit();
		// TODO Auto-generated method stub
		System.out.println("after class");
	

}
}


