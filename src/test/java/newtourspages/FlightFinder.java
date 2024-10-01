package newtourspages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.codemind.b12.Utility;

public class FlightFinder {

	WebDriver driver;

	public FlightFinder(WebDriver driver) {
		this.driver = driver;
	}

	// WebElements
	WebElement flightOneWayTripRadioBtn;
	WebElement continueBtn;
	WebElement passengers;

	public WebElement getFlightOneWayTripRadioBtn() {
		setFlightOneWayTripRadioBtn();
		return flightOneWayTripRadioBtn;
	}

	public void setFlightOneWayTripRadioBtn() {
		flightOneWayTripRadioBtn = driver.findElement(By.xpath("//input[@value='oneway']"));
	}

	public WebElement getContinueBtn() {
		setContinueBtn();
		return continueBtn;
	}

	public void setContinueBtn() {
		this.continueBtn = driver.findElement(By.xpath("//input[@name='findFlights']"));
	}

	public WebElement getPassengers() {
		setPassengers();
		return passengers;
	}

	public void setPassengers() {
		this.passengers = driver.findElement(By.xpath("//select[@name='passCount']"));
	}

	// methods for webelements
	public void checkOneWayTripRadioBtn() {
		getFlightOneWayTripRadioBtn().click();
	}

	public void clickOnContinueBtn() {
		getContinueBtn().click();
	}

	public void setPassengersDropdownValue(String numberOfPasseners) {
		Utility.selectOptionFromDropDownComminUnderSelectTag(getPassengers(), numberOfPasseners);
	}

}
