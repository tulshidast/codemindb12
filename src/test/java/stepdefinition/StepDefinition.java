package stepdefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	WebDriver driver;

	@Given("launch application")
	public void launchApplication() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get(com.codemind.b12.Utility.getProperty("newtoururl2"));
	}

	@When("user enters user name in user name text field")
	public void enterUserName() {
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Admin");
	}

	@And("user enters password in password text field")
	public void enterPassword() {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Admin@123");
	}

	@And("click submit btn")
	public void clickSubmitBtn() {
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}

	@Then("user login successfully msg displayed")
	public void verifyUserLoginMsg() {
		assertEquals(driver.findElement(By.xpath("//h3")).getText(), "Login Successfully");
	}

	@And("close browser")
	public void tearDown() {
		driver.quit();
	}

}
