package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlBasic {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		WebElement searchTextField = driver.findElement(By.xpath("//input[@name='q' and not(@id)]"));

		searchTextField.sendKeys("codemind");
		
		driver.findElement(By.xpath("//input[@id='radio2']")).click();
	}

}
