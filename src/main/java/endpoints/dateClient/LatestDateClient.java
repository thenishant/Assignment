package endpoints.dateClient;

import client.BaseClient;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class LatestDateClient extends BaseClient {
    String latestRatesURL = getLatestDataHost();


    public CurrentDateResponse getLatestData() {
        return getResponse(getLatestDataHost());
    }

    public CurrentDateResponse getLatestData(String URL) {
        return getResponse(URL);
    }

    public CurrentDateResponse getSpecificData(String date) {
        return getResponse(getPasteDataHost() + "/" + date);
    }

    private CurrentDateResponse getResponse(String URL) {
        Response response = given()
                .contentType(ContentType.JSON)
                .get(URL);

        CurrentDateResponse currentDateResponse = response.as(CurrentDateResponse.class);
        currentDateResponse.setHttpStatusCode(response.getStatusCode());
        return currentDateResponse;
    }

    public CurrentDateResponse getResponseForSymbol(String symbol) {
        Response response = given()
                .contentType(ContentType.JSON)
                .queryParam("symbol", symbol)
                .get(latestRatesURL);

        CurrentDateResponse currentDateResponse = response.as(CurrentDateResponse.class);
        currentDateResponse.setHttpStatusCode(response.getStatusCode());
        return currentDateResponse;
    }
}
