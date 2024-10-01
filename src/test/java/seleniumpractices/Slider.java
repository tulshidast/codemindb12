package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.tutorialspoint.com/selenium/practice/slider.php");

		WebElement element = driver.findElement(By.xpath("//input[@id='ageInputId']"));

//		for (int i = 0; i < 20; i++) {
//			slider.sendKeys(Keys.ARROW_RIGHT);
//		}
		
		Actions actions = new Actions(driver);
//		actions.moveToElement(slider, slider.getLocation().getX()-2, 0).click().build().perform();
		
		for (int x = 0; x < element.getSize().getWidth(); x++) {
			  for (int y = 0; y < element.getSize().getHeight(); y++) {
			   actions.moveToElement(element).moveByOffset(x, y).click().build().perform();

//			    if ( //your condition ) {
//			      System.out.println("X and Y when condition satisified  are" + x " and " + y);
//			      break;
//			    }
			  }
			}

	}

}
