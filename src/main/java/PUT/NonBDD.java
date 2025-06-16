package PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

public class NonBDD {
    RequestSpecification R;
    Response Re;
    ValidatableResponse V;
@Test
    public void PUT()
{
    String bookingid = "759";
    String token= "3f912530780c432";

    String Payload="{\n" +
            "    \"firstname\" : \"James\",\n" +
            "    \"lastname\" : \"Brown\",\n" +
            "    \"totalprice\" : 111,\n" +
            "    \"depositpaid\" : true,\n" +
            "    \"bookingdates\" : {\n" +
            "        \"checkin\" : \"2018-01-01\",\n" +
            "        \"checkout\" : \"2019-01-01\"\n" +
            "    },\n" +
            "    \"additionalneeds\" : \"Breakfast\"\n" +
            "}";
     R=RestAssured.given();
     R.basePath("https://restful-booker.herokuapp.com");
     R.baseUri("/booking/"+ bookingid );
     R.cookie("token",token);
     R.contentType(ContentType.JSON);
     R.body(Payload).log().all();

     Re= R.when().log().all().put();

     V= Re.then().log().all();
     V.statusCode(200);








}

}
