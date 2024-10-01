package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToHandleWebTables {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");

		// print table headers
		List<WebElement> tableHeaders = driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));

		for (WebElement header : tableHeaders) {
			System.out.println(header.getText());
		}

		System.out.println("###################################################");

		// print first column data

		List<WebElement> firstColumnData = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[1]"));
		for (WebElement td : firstColumnData) {
			System.out.println(td.getText());
		}

		// print row data
		System.out.println("###################################################");
		List<WebElement> firstRowData = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td"));
		for (WebElement rowTd : firstRowData) {
			System.out.println(rowTd.getText());
		}

		// print all table data
		System.out.println("###################################################");
		List<WebElement> tableData = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td"));
		for (WebElement rowTd : tableData) {
			System.out.println(rowTd.getText());
		}

	}

}
