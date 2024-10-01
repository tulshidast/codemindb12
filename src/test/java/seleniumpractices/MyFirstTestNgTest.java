package seleniumpractices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstTestNgTest {

	@Test
	public void verifyHomePageTitle() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		String actualTitle = driver.getTitle();

		Assert.assertEquals(actualTitle, "omayo (QAFox.com)", "Title is not matching according to test case");

		driver.quit();
	}

}
