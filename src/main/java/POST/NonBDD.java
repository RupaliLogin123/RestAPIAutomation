package POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

public class NonBDD {

    @Test
            public void NonBDD()
    {
    String Payload="{\n" +
            "    \"username\" : \"admin\",\n" +
            "    \"password\" : \"password123\"\n" +
            "}";
    RequestSpecification Req;
    Response Res;
    ValidatableResponse V;

Req= RestAssured.given();
Req.baseUri("https://restful-booker.herokuapp.com");
Req.basePath("/auth");
Req.contentType(ContentType.JSON);
Req.body(Payload).log().all();
Res=Req.when().log().all().post();
    V=Res.then().log().all();
V.statusCode(200);
}}