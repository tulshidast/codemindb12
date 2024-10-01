package newtoursetestcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.codemind.b12.Utility;

import newtourspages.FlightFinder;
import newtourspages.HomePage;
import newtourspages.ReservationPage;

public class VerifyFindFlightFunctinality extends BaseTest {

	HomePage homePage;
	FlightFinder flightFinder;
	ReservationPage reservationPage;

	@Test
	public void verifyFindFlight() throws InterruptedException, IOException {
		homePage = new HomePage(driver);
		flightFinder = new FlightFinder(driver);
		reservationPage = new ReservationPage(driver);

		homePage.clickOnFligtsLink();
		flightFinder.checkOneWayTripRadioBtn();
		flightFinder.setPassengersDropdownValue("2");
		flightFinder.clickOnContinueBtn();
		String title = reservationPage.getFlightFinderPageText();
		Utility.takesScreenshot(driver, "verifyFindFlight");
		Assert.assertTrue(title.contains("After flight finder"), "Flight finder page text is not matching");
	}
}
