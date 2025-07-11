package EX003;

import io.restassured.RestAssured;
import org.junit.Test;


public class Lab006_TestClasses {
    String pincode="110048";
    @Test
    public void PositiveTC()
    {
         String pincode="110048";
        RestAssured.given().baseUri("https://api.zippopotam.us/").basePath("/IN/"+pincode)
                .when().get()
                .then().log().all().statusCode(200);
    }
    @Test
    public void test_GET_NEGATIVE_TC2() {
        pincode = "@";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(404);
    }

    @Test
    public void test_GET_NEGATIVE_TC3() {
        pincode = " ";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/USA/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(404);

    }



}
