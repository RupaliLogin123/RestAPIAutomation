package POST;

import io.restassured.RestAssured;
import org.junit.Test;

public class BDD {
    String payload = "{\n" +
            "    \"username\" : \"admin\",\n" +
            "    \"password\" : \"password123\"\n" +
            "}";
    @Test
    public void Post()
    {
        RestAssured.given().baseUri("https://restful-booker.herokuapp.com").basePath("auth").
                contentType("application/json").
                when().log().all().post().
                then().statusCode(200);


    }
}
