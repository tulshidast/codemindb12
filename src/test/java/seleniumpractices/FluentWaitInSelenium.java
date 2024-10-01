package seleniumpractices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitInSelenium {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://omayo.blogspot.com/");

		WebElement invisibleText = driver.findElement(By.cssSelector("#delayedText"));

		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(11));

		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver);
		fluentWait.withTimeout(Duration.ofSeconds(11)).pollingEvery(Duration.ofMillis(50))
				.ignoring(TimeoutException.class).until(ExpectedConditions.visibilityOf(invisibleText));

		// wait.until(ExpectedConditions.visibilityOf(invisibleText));

		System.out.println(invisibleText.isDisplayed());

		WebElement myButton = driver.findElement(By.cssSelector("#myBtn"));

		System.out.println(myButton.isEnabled());

		WebElement tryButton = driver.findElement(By.xpath("//button[text()='Try it']"));

		tryButton.click();

		System.out.println(myButton.isEnabled());

		fluentWait.until(ExpectedConditions.attributeToBe(myButton, "disabled", "true"));

		// wait.until(ExpectedConditions.attributeToBe(myButton, "disabled", "true"));

		System.out.println("disabled attribute value = " + myButton.getAttribute("disabled"));

		System.out.println(myButton.isEnabled());

	}

}
