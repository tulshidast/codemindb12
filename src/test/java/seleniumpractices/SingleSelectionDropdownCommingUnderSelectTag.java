package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectionDropdownCommingUnderSelectTag {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");

		WebElement singleSelectDropdown = driver.findElement(By.cssSelector("select[id='drop1']"));

		Select select = new Select(singleSelectDropdown);

		List<WebElement> dropdownOptions = select.getOptions();

		for (WebElement option : dropdownOptions) {
			System.out.println(option.getText());
		}

		System.out.println("#######################################################");

		System.out.println(select.getFirstSelectedOption().getText());

		System.out.println("########################################################");

		System.out.println(select.isMultiple());

		System.out.println("#########################################################");

		select.selectByIndex(3);

		Thread.sleep(2000);

		select.selectByValue("def");

		Thread.sleep(2000);

		select.selectByVisibleText("doc 4");
		
		//select.deselectAll();

	}

}
