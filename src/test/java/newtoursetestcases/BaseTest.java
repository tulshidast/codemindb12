package newtoursetestcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.codemind.b12.Utility;

public class BaseTest {

	WebDriver driver;

	@BeforeMethod(alwaysRun = true)
	public void setup() throws IOException {

		this.driver = Utility.getDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get(Utility.getProperty("newtoururl2"));
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}

}
