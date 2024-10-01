package TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_POM extends  Base_Demo1{
	
	@FindBy(xpath = "//span[text()='Logout']")
	private WebElement logout;

	public WebDriver driver;
	public Logout_POM(WebDriver driver2) {
		driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogout() {
		return logout;
	}

}
