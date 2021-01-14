package endpoints.specificDateClient;

import client.BaseClient;
import endpoints.dateClient.CurrentDateResponse;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class SpecificDateClient extends BaseClient {

    public SpecificDateResponse getResponse(String date) {
        String URL = getPasteDataHost() + "/" + date;
        Response response = given()
                .contentType(ContentType.JSON)
                .get(URL);

        SpecificDateResponse specificDateResponse = response.as(SpecificDateResponse.class);
        specificDateResponse.setHttpStatusCode(response.getStatusCode());
        return specificDateResponse;
    }
}
