package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgAnnotationExample {

	WebDriver driver;

	@BeforeMethod(alwaysRun = true)
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");

	}

	@Test(priority = 3)
	public void test1() {
		Assert.assertEquals(driver.getTitle(), "omayo (QAFox.com)");
		System.out.println("verifyPageTitle");
	}

	@Test(priority = -2)
	public void test2() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://omayo.blogspot.com/");
		System.out.println("verifyCurrentUrl");
	}

	@Test(priority = -1, enabled = false)
	public void test3() {
		Assert.assertEquals(driver.findElement(By.cssSelector("#radio1")).isSelected(), false);
		System.out.println("verifyMaleRadioBtnIsBydefaultNotSelected");
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {

		driver.quit();

	}

}
