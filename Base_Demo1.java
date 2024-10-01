package TESTNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Demo1 {
	static WebDriver driver;
	
	 public static WebDriver BrowserLaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
		
		 
		}
	
	 public static void Url(String s) {
		driver.get(s);

	}
	
	public static void Sendkeys(WebElement a,String s1) {
		a.sendKeys(s1);

	}
	
	public static void Click(WebElement b) {
		b.click();

	}
	
	public static void Quit() {
	      
	}
	
	public static void Selectby_index(WebElement c, int i) {
		Select s3 = new Select(c);
		s3.selectByIndex(i);

	}
	public static void Selectby_Value(WebElement d, String j) {
		Select s4 = new Select(d);
		s4.selectByValue(j);
	}
	
	public static void Selectby_Visibletext(WebElement e, String k) {
		Select s4 = new Select(e);
		s4.selectByVisibleText(k);
	}
	
	public static void screenshot(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File desc = new File("C:\\Users\\kamsr\\OneDrive\\Desktop\\SeleniumBrowser\\ScreenShot\\"+name+".png");
		FileUtils.copyFile(src, desc);
				
	}
	
	public static void Alert1() {
		 Alert a = driver.switchTo().alert();
		 a.accept();

	}
	
	public static void action(WebElement ele) {
		Actions ac=new Actions(driver);
		ac.moveToElement(ele).perform();// TODO Auto-generated method stub

	}
	
		public static void Robot1() throws AWTException {
			Robot r= new Robot();  //AWT is abstract window tool kit
		      r.keyPress(KeyEvent.VK_DOWN);
		       r.keyRelease(KeyEvent.VK_DOWN);
		       r.keyPress(KeyEvent.VK_ENTER);
		       r.keyRelease(KeyEvent.VK_ENTER);
		}

	
		public static void ImplicitWait() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
			
		
		}
	
	
}
