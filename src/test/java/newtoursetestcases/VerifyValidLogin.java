package newtoursetestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import newtourspages.HomePage;
import newtourspages.LoginSuccessPage;

public class VerifyValidLogin extends BaseTest {

	HomePage homePage;
	LoginSuccessPage loginSuccessPage;

	@Test(enabled = true)
	public void verifyValidLogin() {
		homePage = new HomePage(driver);
		loginSuccessPage = new LoginSuccessPage(driver);

		homePage.setUsername("admin1");
		homePage.setPassword("admin1");
		homePage.clickOnSubmitBtn();

		String loginSuccessMsg = loginSuccessPage.getLoginSuccessText();

		Assert.assertEquals(loginSuccessMsg, "Login Successfully");
	}

}
