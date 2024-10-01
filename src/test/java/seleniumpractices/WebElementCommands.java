package seleniumpractices;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class WebElementCommands {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		WebElement textAreaField = driver.findElement(By.cssSelector("textarea#ta1"));

		textAreaField.sendKeys("Welcome to codemind");

		Thread.sleep(3000);

		textAreaField.clear();

		System.out.println(textAreaField.getAttribute("cols"));

		WebElement dropdownBtn = driver.findElement(By.cssSelector("button.dropbtn"));

		System.out.println(dropdownBtn.getCssValue("background-color"));

		System.out.println(dropdownBtn.getCssValue("font-size"));

		System.out.println("Tag name = " + dropdownBtn.getTagName());

		System.out.println(dropdownBtn.getText());

		System.out.println(
				driver.findElement(By.cssSelector("#table1")).findElement(By.cssSelector("tbody tr td")).getText());
		System.out.println(driver.findElement(By.cssSelector("tbody>tr:nth-of-type(3)>td:nth-of-type(3)")).getText());

		WebElement button2 = driver.findElement(By.cssSelector("#but2"));
		System.out.println(button2.getSize().getHeight());
		System.out.println(button2.getSize().getWidth());

		File screenshot = button2.getScreenshotAs(OutputType.FILE);

		System.out.println(screenshot.getAbsolutePath());

		Files.copy(screenshot, new File("C:/Users/Admin/Desktop/myscreenshot_1.png"));

		System.out.println(button2.isDisplayed());

		System.out.println(driver.findElement(By.cssSelector("#hbutton")).isDisplayed());

		System.out.println(button2.isEnabled());

		System.out.println(driver.findElement(By.cssSelector("#but1")).isEnabled());

		// True if the element is currently selected or checked, false otherwise
		WebElement maleRadioBtn = driver.findElement(By.cssSelector("#radio1"));
		System.out.println("Male radio btn before check = " + maleRadioBtn.isSelected());
		maleRadioBtn.click();
		System.out.println("Male radio btn after check = " + maleRadioBtn.isSelected());

		System.out.println(
				"Orage checkbox is selected = " + driver.findElement(By.cssSelector("#checkbox1")).isSelected());

		System.out.println(
				"Blue checkbox is selected = " + driver.findElement(By.cssSelector("#checkbox2")).isSelected());

		Point point = maleRadioBtn.getLocation();

		System.out.println(point.getX());
		System.out.println(point.getY());

	}

}
