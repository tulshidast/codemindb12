package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

	WebDriver driver;

	@Test
	public void test() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");

		Assert.assertEquals(driver.getTitle(), "omayo (QAFox.com)");

		Assert.assertEquals(driver.getTitle(), "omayo (QAFox.com) ", "Home page title not matching");

		System.out.println("After assert failed");

		// Assert.assertNotEquals(driver.getTitle(), "omayo QAFox.com");
		Assert.assertNotEquals(driver.getTitle(), "omayo QAFox.com", "Home page disply older title");

		Assert.assertTrue(driver.findElement(By.cssSelector("#checkbox1")).isSelected());

		Assert.assertTrue(driver.findElement(By.cssSelector("#checkbox1")).isSelected(),
				"Orange check box is by default unchecked");
		Assert.assertFalse(driver.findElement(By.cssSelector("#checkbox2")).isSelected(),
				"Blue check box is by default checked");
	}

}
