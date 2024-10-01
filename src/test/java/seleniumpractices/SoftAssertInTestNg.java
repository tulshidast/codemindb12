package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertInTestNg {

	@Test
	public void test() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		SoftAssert verify = new SoftAssert();

		verify.assertEquals(driver.getTitle(), "omayo (QAFox.com)");

		verify.assertEquals(driver.getTitle(), "omayo (QAFox.com) ", "Home page title not matching");

		System.out.println("After assert failed");

		// Assert.assertNotEquals(driver.getTitle(), "omayo QAFox.com");
		verify.assertNotEquals(driver.getTitle(), "omayo QAFox.com", "Home page disply older title");

		verify.assertTrue(driver.findElement(By.cssSelector("#checkbox1")).isSelected());

		verify.assertTrue(driver.findElement(By.cssSelector("#checkbox1")).isSelected(),
				"Orange check box is by default unchecked");
		verify.assertFalse(driver.findElement(By.cssSelector("#checkbox2")).isSelected(),
				"Blue check box is by default checked");
		verify.assertAll();
	}

}
