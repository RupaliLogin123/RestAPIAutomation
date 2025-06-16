package GET;

import io.restassured.RestAssured;
import org.junit.Test;

public class BddStyle {
    @Test
    public void Get() {
        String pincode="388620";
        RestAssured.given().baseUri("https://api.zippopotam.us/").basePath("/IN/"+pincode)
                .when().log().all().get()
                .then().log().all().statusCode(200);

    }

}
