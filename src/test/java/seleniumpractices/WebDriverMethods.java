package seleniumpractices;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		// Load a new web page in the current browser window.
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		// The URL of the page currently loaded in the browser
		System.out.println("Current url of page = " + driver.getCurrentUrl());

		// Get the title of the current page.
		System.out.println("Current page title = " + driver.getTitle());

		// Get the source of the last loaded page.
		// System.out.println("Page source = " + driver.getPageSource());

		// Find the first WebElement using the given method.
		WebElement usernameTextBox = driver.findElement(By.xpath("//form[@name='form1']//input[@type='text']"));
		usernameTextBox.sendKeys("Codemind");

		// Find all elements within the current page using the given mechanism
		List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@type='radio']"));

		System.out.println("Number of radio button on the page = " + radioButtons.size());

		for (WebElement radioBtn : radioButtons) {
			System.out.println(radioBtn.getAttribute("value"));
		}

		System.out.println("###################################");

		List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));

		Iterator<WebElement> checkboxesItr = checkboxes.iterator();

		while (checkboxesItr.hasNext()) {
			System.out.println(checkboxesItr.next().getAttribute("value"));
		}

		System.out.println("###################################################");

		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.amazon.in/");

		// Close the current window, quitting the browser if it's the last window
		// currently open.
		// driver.close();

		// browser navigation commands

		driver.navigate().to("https://www.flipkart.com/");

		Thread.sleep(2000);

		driver.navigate().back();

		Thread.sleep(2000);

		driver.navigate().forward();

		Thread.sleep(2000);

		driver.navigate().refresh();

		String windowHandle = driver.getWindowHandle();

		System.out.println("Current window handle = " + windowHandle);

		System.out.println("#####################################################");

		Set<String> handles = driver.getWindowHandles();

		for (String handle : handles) {
			System.out.println(handle);
		}

		// Quits this driver, closing every associated window.
		driver.quit();

	}

}
