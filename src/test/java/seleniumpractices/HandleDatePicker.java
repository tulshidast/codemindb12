package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDatePicker {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.tutorialspoint.com/selenium/practice/date-picker.php");
		HandleDatePicker handleDatePicker = new HandleDatePicker();
		handleDatePicker.selectDate("2023", "August", "19");

		handleDatePicker.selectDate("2025", "December", "31");

	}

	public void selectDate(String year, String month, String date) {

		driver.findElement(By.cssSelector("input#datetimepicker1")).click();

		driver.findElement(By.xpath("//input[@aria-label='Year']")).clear();

		driver.findElement(By.xpath("//input[@aria-label='Year']")).sendKeys(year);

		Select select = new Select(driver.findElement(By.xpath("//select[@aria-label='Month']")));
		select.selectByVisibleText(month);

		driver.findElement(
				By.xpath("(//div[@class='dayContainer']//span[@class='flatpickr-day' and text()='" + date + "'])[1]"))
				.click();

		driver.findElement(By.xpath("//h1[text()='Date Picker']")).click();
	}

}
