package steps;

import endpoints.dateClient.CurrentDateResponse;
import endpoints.specificDateClient.SpecificDateClient;
import endpoints.specificDateClient.SpecificDateResponse;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SpecificDateFERSteps {
    SpecificDateClient specificDateClient;
    SpecificDateResponse response;
    String date = "2019-01-12";

    @When("specific date rates API is available")
    public void specificDateRatesAPIIsAvailable() {
        specificDateClient = new SpecificDateClient();
    }

    @Then("specific date rates response status should be {int}")
    public void specificDateRatesResponseStatusShouldBe(int statusCode) {
        Assert.assertEquals(specificDateClient.getResponse(date).getHttpStatusCode(), statusCode);
    }

    @Then("the response for specific date for GBP should match")
    public void theResponseForSpecificDateForGBPShouldMatch() {
        response = specificDateClient.getResponse(date);
        Assert.assertEquals(response.getBase(), "EUR");
    }

    @When("user hits a future date rates API")
    public void userHitsAFutureDateRatesAPI() {
        response = specificDateClient.getResponse(date);
    }
}
