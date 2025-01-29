package week2.day3.homeactivity;

public class LoginTestData extends TestData{
	public void enterUsername() {
		System.out.println("subclass LoginTestData enterUsername");

	}
	public void enterPassword() {
		System.out.println("subclass LoginTestData enterPassword");

	}
	
	public static void main(String[] args) {
		LoginTestData objLoginTestData = new LoginTestData();
		objLoginTestData.enterUsername();
		objLoginTestData.enterPassword();
		objLoginTestData.enterCredentials();
		objLoginTestData.navigateToHomePage();
		/*Expected Outcome:
- Create a subclass that inherits attributes and methods from a superclass*/
	}
}
