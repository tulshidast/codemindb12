package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");

		// driver.switchTo().frame("navbar-iframe");
		// driver.switchTo().frame(0);

		WebElement frame_1 = driver.findElement(By.xpath("//iframe[@id='navbar-iframe']"));
		driver.switchTo().frame(frame_1);

		driver.findElement(By.cssSelector("#b-query:nth-child(1)")).sendKeys("codemind technology");

		driver.switchTo().defaultContent();

		driver.findElement(By.cssSelector("#radio2")).click();

		driver.switchTo().frame(frame_1);

		driver.findElement(By.cssSelector("#b-query:nth-child(1)")).clear();

		driver.switchTo().defaultContent();

		driver.findElement(By.cssSelector("#radio1")).click();
	}

}
