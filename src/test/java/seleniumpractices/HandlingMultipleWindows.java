package seleniumpractices;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");

		driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();

		String parentWindow = driver.getWindowHandle();

		Set<String> windowsHandles = driver.getWindowHandles();

		for (String handle : windowsHandles) {

			if (handle.equals(parentWindow)) {
				continue;
			} else {
				driver.switchTo().window(handle);
			}
		}

		String newWindowTitle = driver.getTitle();

		System.out.println(newWindowTitle);

		driver.close();

		driver.switchTo().window(parentWindow);

		driver.findElement(By.cssSelector("#radio1")).click();

	}

}
