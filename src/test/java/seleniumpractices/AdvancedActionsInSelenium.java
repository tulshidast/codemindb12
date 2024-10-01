package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AdvancedActionsInSelenium {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com/");

		Actions actions = new Actions(driver);

		actions.click(driver.findElement(By.xpath("//textarea[@name='q']"))).build().perform();
		// actions.click().build().perform();

		actions.keyDown(Keys.SHIFT).keyDown("l").keyUp(Keys.SHIFT).keyUp("l").keyDown("n").keyUp("n").build().perform();

		actions.moveToElement(driver.findElement(By.xpath("//a[@aria-label='Google apps']"))).build().perform();

		actions.contextClick().build().perform();

		actions.doubleClick(driver.findElement(By.xpath("//textarea[@name='q']"))).build().perform();

		driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/droppable.php");

		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));

		WebElement target = driver.findElement(By.cssSelector("div#droppable"));

		actions.dragAndDrop(source, target).build().perform();

	}

}
