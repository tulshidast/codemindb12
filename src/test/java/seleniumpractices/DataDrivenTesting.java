package seleniumpractices;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.codemind.b12.Utility;

import org.testng.annotations.DataProvider;

public class DataDrivenTesting {

	@Test(dataProvider = "usersData")
	public void verifyValidLogin(String userName, String password, String msg) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/newtours/index.php");

		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		String loginSuccesfulMsg = driver.findElement(By.xpath("//h3[text()='Login Successfully']")).getText();

		Assert.assertEquals(loginSuccesfulMsg, msg);

		driver.quit();
	}

	@DataProvider(name = "usersData")
	public String[][] DataProvider() throws IOException {
		String[][] users = { { Utility.getProperty("username"), Utility.getProperty("password"), "Login Successfully" },
				{ "admin2", "admin2", "Login Successfully" }, { "admin3", "admin3", "Login Successfully" } };
		return users;
	}

}
