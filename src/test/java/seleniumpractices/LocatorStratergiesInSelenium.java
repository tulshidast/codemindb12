package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStratergiesInSelenium {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		// Load a new web page in the current browser window
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		// name attribute
		WebElement element = driver.findElement(By.name("gender"));
		element.click();

		Thread.sleep(3000);

		// by id attribute
		driver.findElement(By.id("radio2")).click();

		// by tag name
		List<WebElement> linksOnPage = driver.findElements(By.tagName("a"));

		System.out.println("Numbers of hyper links on page = " + linksOnPage.size());

		// by link text
		WebElement pageOneLink = driver.findElement(By.linkText("Page One"));
		System.out.println(pageOneLink.getAttribute("href"));

		// by partial link text
		System.out.println(driver.findElement(By.partialLinkText("sts (Ato")).getAttribute("href"));
	}

}
