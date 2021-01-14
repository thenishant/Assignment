package steps;

import endpoints.dateClient.CurrentDateResponse;
import endpoints.dateClient.LatestDataClient;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static org.testng.AssertJUnit.assertEquals;

public class LatestRatesSteps {
    LatestDataClient latestDataClient;
    CurrentDateResponse currentDateResponse;

    @When("the API is available")
    public void theAPIIsAvailable() {
        latestDataClient = new LatestDataClient();
    }

    @Then("the response status code should be {int}")
    public void theResponseStatusCodeShouldBe(int statusCode) {
        assertEquals(latestDataClient.getLatestData().getHttpStatusCode(), statusCode);
    }

    @Then("^the response for (\\w+) should match$")
    public void theResponseForGBPShouldMatch(String symbol) {
        CurrentDateResponse responseForSymbol = latestDataClient.getResponseForSymbol(symbol);

        Assert.assertEquals(responseForSymbol.base, "EUR");
        Assert.assertEquals(responseForSymbol.rates.USD, "1.2166");

    }

    @And("user hits an invalid URL")
    public void userHitsAnInvalidURL() {
        currentDateResponse = latestDataClient.getLatestData("https://api.ratesapi.io/api/");
    }

    @Then("user should get error message")
    public void userShouldGetErrorMessage() {
        assertEquals(currentDateResponse.error, "time data 'api' does not match format '%Y-%m-%d'");
    }
}
