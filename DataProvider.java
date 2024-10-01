package TESTNG;

import org.testng.annotations.Test;

public class DataProvider {
	@Test(dataProvider="login")
	private void test(String user, String pass) {
		System.out.println("user is "+user);
		System.out.println("pass is "+pass);
	}
	
	@org.testng.annotations.DataProvider(name="login")
	public String[][] data(){
		
		return new String[][] {
			{"kams@gmail.com","kams@123"},
			{"ritu@gmail.com","ritu@123"},
			{"kavin@gmail.com","kavin@123"},
			{"test@gmail.com","test@123"}
		};
	}

}
