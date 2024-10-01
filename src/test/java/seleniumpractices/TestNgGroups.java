package seleniumpractices;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.codemind.b12.Utility;

public class TestNgGroups {

	WebDriver driver;
	SoftAssert verify;

	@BeforeMethod(alwaysRun = true)
	public void setup() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Utility.getProperty("url"));
		verify = new SoftAssert();
	}

	@Test(groups = { "smoke" })
	public void verifyTitle() {
		verify.assertEquals(driver.getTitle(), "omayo (QAFox.com");
		verify.assertAll();
	}

	@Test(groups = { "sanity", "smoke" })
	public void verifyUrl() {
		verify.assertEquals(driver.getCurrentUrl(), "https://omayo.blogspot.com/");
		verify.assertAll();
	}

	@Test(groups = { "regression" })
	public void verifyOrageCheckBox() {
		verify.assertTrue(driver.findElement(By.cssSelector("#checkbox1")).isSelected(),
				"Orange check box is by default unchecked");
		verify.assertAll();
	}

	@Test(groups = { "regression" })
	public void verifyBlueCheckBox() {
		verify.assertTrue(driver.findElement(By.cssSelector("#checkbox2")).isSelected(),
				"Blue check box is by default unchecked");
		verify.assertAll();
	}

	@Test(groups = { "sanity" })
	public void verifyDropDownOptions() {

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
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}

}
