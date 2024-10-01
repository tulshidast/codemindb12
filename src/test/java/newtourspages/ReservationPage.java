package newtourspages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReservationPage {

	WebDriver driver;

	public ReservationPage(WebDriver driver) {
		this.driver = driver;
	}

	// Web Elements
	WebElement flightFinderPageTitle;

	public WebElement getFlightFinderPageTitle() {
		setFlightFinderPageTitle();
		return flightFinderPageTitle;
	}

	public void setFlightFinderPageTitle() {
		this.flightFinderPageTitle = driver
				.findElement(By.xpath("(//font[contains(*,'After flight finder')]//font[@size='4'])[1]"));
	}

	public String getFlightFinderPageText() {
		return getFlightFinderPageTitle().getText();
	}

}
