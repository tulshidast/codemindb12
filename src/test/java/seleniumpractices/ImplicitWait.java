package seleniumpractices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//input[@id='sachin']"));
		
		driver.findElement(By.xpath("//input[@id='bn']"));
		
		driver.findElement(By.xpath("//input[@id='n1']"));
		
		driver.findElement(By.xpath("//input[@id='oo']"));

	}

}
