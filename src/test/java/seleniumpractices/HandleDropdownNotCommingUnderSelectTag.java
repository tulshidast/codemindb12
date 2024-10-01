package seleniumpractices;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleDropdownNotCommingUnderSelectTag {

	public static void main(String[] args) {

		HandleDropdownNotCommingUnderSelectTag handleDropdownNotCommingUnderSelectTag = new HandleDropdownNotCommingUnderSelectTag();
		handleDropdownNotCommingUnderSelectTag.selectCountry("qatar");
		handleDropdownNotCommingUnderSelectTag.selectCountry("Saudi arabia");
	}

	public void selectCountry(String country) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.airvistara.com/in/en/club-vistara/login/login-page");

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@data-toggle='dropdown']")));

		driver.findElement(By.xpath("//span[@data-toggle='dropdown']")).click();

		// driver.findElement(By.xpath("//ul[@id='country-scroll']//li/span[text()='" +
		// country + "']")).click();

		List<WebElement> allCountry = driver.findElements(By.cssSelector("#country-scroll li span"));

		for (WebElement con : allCountry) {
			if (con.getText().equalsIgnoreCase(country)) {
				con.click();
				break;
			}
		}
	}

}
