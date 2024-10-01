package seleniumpractices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitInSelenium {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://omayo.blogspot.com/");

		WebElement invisibleText = driver.findElement(By.cssSelector("#delayedText"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(11));
		wait.until(ExpectedConditions.visibilityOf(invisibleText));

		System.out.println(invisibleText.isDisplayed());

		WebElement myButton = driver.findElement(By.cssSelector("#myBtn"));

		System.out.println(myButton.isEnabled());

		WebElement tryButton = driver.findElement(By.xpath("//button[text()='Try it']"));

		tryButton.click();

		System.out.println(myButton.isEnabled());

		wait.until(ExpectedConditions.attributeToBe(myButton, "disabled", "true"));

		System.out.println("disabled attribute value = " + myButton.getAttribute("disabled"));

		System.out.println(myButton.isEnabled());
	}

}
