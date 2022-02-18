package tests;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import org.json.JSONArray;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.hasSize;


public class ApiTest {

    /*@Test
    public void givenUserDoesNotExists_whenUserInfoIsRetrieved_then404IsReceived()
            throws ClientProtocolException, IOException {

        // Given
        *//*String name = RandomStringUtils.randomAlphabetic( 8 );*//*

        HttpGet reqst = new HttpGet( "https://eventsexpress-test.azurewebsites.net/api/Category/All/" + "78ed6ee2-9d5a-4802-aced-b3284e948a83" );

        CloseableHttpClient client = HttpClients.createDefault();

        CloseableHttpResponse response = client.execute(reqst);

        HttpEntity entity = response.getEntity();
        String result = EntityUtils.toString(entity);
        JSONArray obj = new JSONArray(result);

    }

    @Test
    public void givenUrl_whenSuccessOnGetsResponseAndJsonHasRequiredKV_thenCorrect() {
        get("https://eventsexpress-test.azurewebsites.net/api/Category/All/" + "78ed6ee2-9d5a-4802-aced-b3284e948a83").then().statusCode(200).assertThat()
                .body("$", hasSize(9));
    }*/

}
