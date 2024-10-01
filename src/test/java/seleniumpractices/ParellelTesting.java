package seleniumpractices;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ParellelTesting {

	@Test(groups = { "smoke" })
	public void verifyTitle() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		SoftAssert verify = new SoftAssert();
		verify.assertEquals(driver.getTitle(), "omayo (QAFox.com)");
		verify.assertAll();
		driver.quit();
	}

	@Test(groups = { "sanity", "smoke" })
	public void verifyUrl() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		SoftAssert verify = new SoftAssert();
		verify.assertEquals(driver.getCurrentUrl(), "https://omayo.blogspot.com/");
		verify.assertAll();
		driver.quit();
	}

	@Test(groups = { "regression" })
	public void verifyOrageCheckBox() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		SoftAssert verify = new SoftAssert();
		verify.assertTrue(driver.findElement(By.cssSelector("#checkbox1")).isSelected(),
				"Orange check box is by default unchecked");
		verify.assertAll();
		driver.quit();
	}

	@Test(groups = { "regression" })
	public void verifyBlueCheckBox() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		SoftAssert verify = new SoftAssert();
		verify.assertFalse(driver.findElement(By.cssSelector("#checkbox2")).isSelected(),
				"Blue check box is by default unchecked");
		verify.assertAll();
		driver.quit();
	}

	@Test(groups = { "sanity" })
	public void verifyDropDownOptions() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		SoftAssert verify = new SoftAssert();

		ArrayList<String> expectedDropDownOptions = new ArrayList<String>();
		expectedDropDownOptions.add("Volvo");
		expectedDropDownOptions.add("Swift");
		expectedDropDownOptions.add("Hyundai");
		expectedDropDownOptions.add("Audi");

		Select select = new Select(driver.findElement(By.cssSelector("#multiselect1")));

		List<WebElement> dropDownWebElements = select.getOptions();
		ArrayList<String> actualDropDownOptions = new ArrayList<String>();

		for (WebElement option : dropDownWebElements) {
			actualDropDownOptions.add(option.getText());
		}

		verify.assertEquals(actualDropDownOptions, expectedDropDownOptions, "Dropdown options are not matching");
		verify.assertAll();
		driver.quit();
	}

}
