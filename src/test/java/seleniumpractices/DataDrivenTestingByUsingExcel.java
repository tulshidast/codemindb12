package seleniumpractices;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.codemind.b12.Utility;

public class DataDrivenTestingByUsingExcel {

	@Test
	public void createUser() throws IOException {
		WebDriver driver = new ChromeDriver();

		driver.get(Utility.getProperty("newtoururl"));

		ArrayList<String> userDetails = Utility.getExcelData("Sheet3");

		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(userDetails.get(0));
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(userDetails.get(1));
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys(userDetails.get(2));

		WebElement dropdown = driver.findElement(By.name("country"));

		Utility.selectOptionFromDropDownComminUnderSelectTag(dropdown, userDetails.get(3));
	}
}
