package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToScrollInSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");

		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;

//		javascriptExecutor.executeScript("window.scrollBy(0,1500)", "");
//
//		Thread.sleep(3000);
//
//		javascriptExecutor.executeScript("window.scrollBy(0,-1000)", "");
//
//		Thread.sleep(3000);
//
//		javascriptExecutor.executeScript("window.scrollBy(100,0)", "");
//
//		Thread.sleep(3000);
//
//		javascriptExecutor.executeScript("window.scrollBy(-100,0)", "");
//		
//		Thread.sleep(3000);

		// javascriptExecutor.executeScript("window.scrollBy(100,1500)", "");

//		WebElement locateUsingClassTextBox = driver.findElement(By.cssSelector(".classone"));
//
//		javascriptExecutor.executeScript("arguments[0].scrollIntoView();", locateUsingClassTextBox);
//
//		locateUsingClassTextBox.sendKeys("Test scroll");
//		javascriptExecutor.executeScript("window.scrollBy(document.body.scrollWidth,0)");
//		javascriptExecutor.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		// javascriptExecutor.executeScript("window.scrollBy(document.body.scrollWidth,document.body.scrollHeight)");
		
		javascriptExecutor.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.cssSelector("form[name='form1'] input[type='password']")));

		javascriptExecutor.executeScript("arguments[0].click();", driver.findElement(By.xpath("(//div[@id='Attribution1']/div/a)[1]")));
	}

}
