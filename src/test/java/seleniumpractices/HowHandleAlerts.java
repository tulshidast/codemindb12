package seleniumpractices;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowHandleAlerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");

		WebElement locateUsingNameTextBox = driver.findElement(By.xpath("//input[@name='textboxn']"));

		locateUsingNameTextBox.sendKeys("Welcome to codemind");

		driver.findElement(By.cssSelector("#confirm")).click();

		Thread.sleep(3000);

		Alert alt = driver.switchTo().alert();

		// alt.accept();

		// alt.dismiss();

		System.out.println(alt.getText());

		alt.accept();

		Thread.sleep(3000);

		locateUsingNameTextBox.clear();

	}

}
