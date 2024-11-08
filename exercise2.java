import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class exercise2 {

    @Test
    public void testGetRequest() {
        // Set the base URL for the API
        String baseUrl = "https://reqres.in/api/users/2";

        // Make the GET request and capture the response
        Response response = RestAssured.get(baseUrl);

        // Print the response body for debugging purposes (optional)
        System.out.println("Response Body: " + response.getBody().asString());

        // Verify that the status code is 200
        int statusCode = response.getStatusCode();
        System.out.println("Status Code: " + statusCode);
        Assert.assertEquals(statusCode, 200, "Expected status code to be 200");
    }
}
