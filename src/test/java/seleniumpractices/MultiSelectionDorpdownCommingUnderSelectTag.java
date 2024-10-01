package seleniumpractices;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectionDorpdownCommingUnderSelectTag {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");

		Select select = new Select(driver.findElement(By.xpath("//select[@id='multiselect1']")));

		List<WebElement> allOptions = select.getOptions();

		Iterator<WebElement> it = allOptions.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().getText());
		}

		System.out.println("###############################");

		select.selectByVisibleText("Audi");
		select.selectByIndex(0);
		select.selectByValue("Hyundaix");

		System.out.println("#####################################");

		System.out.println(select.getFirstSelectedOption().getText());

		System.out.println("#######################################");
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();

		for (WebElement option : allSelectedOptions) {
			System.out.println(option.getText());
		}

		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		select.deselectAll();

		Thread.sleep(3000);

		select.selectByVisibleText("Audi");
		select.selectByIndex(0);
		select.selectByValue("Hyundaix");

		select.deselectByIndex(2);
		select.deselectByValue("volvox");
		select.deselectByVisibleText("Audi");
		
		System.out.println(select.isMultiple());

	}

}
