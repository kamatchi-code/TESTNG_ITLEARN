package TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin_POM  extends  Base_Demo1 {
	
	
	
	
	@FindBy(id = "user_login")
	private WebElement user;

	public Signin_POM(WebDriver driver2) {
		driver=driver2;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//span[contains(text(),'Sign in?')]")
	private WebElement sign;

	public WebElement getSign() {
		return sign;
	}
	
	public WebElement getUser() {
		return user;
	}
	
	@FindBy(id = "user_pass")
	private WebElement pass;

	public WebElement getPass() {
		return pass;
	}
	@FindBy(name = "wp-submit")
	private WebElement Login;

	public WebElement getLogin() {
		return Login;
	}

}
