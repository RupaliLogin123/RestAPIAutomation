package PATCH;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

public class NonBDD {
    RequestSpecification R;
    Response Rs;
    ValidatableResponse V;
    String booking="3120";
    String Payload="{\n" +
            "    \"firstname\" : \"James\",\n" +
            "    \"lastname\" : \"Brown\"\n" +
            "}";
   String token="8ceff793314a3ee";
    @Test
    public void Patch()
    {
    R= RestAssured.given();
    R.baseUri("https://restful-booker.herokuapp.com");
    R.basePath("booking/" + booking);
    R.contentType(ContentType.JSON);
    R.cookie("token",token);
    R.body(Payload).log().all();
    Rs= R.when().log().all().patch();


    V =Rs.then().log().all();
    V.statusCode(200);

}}