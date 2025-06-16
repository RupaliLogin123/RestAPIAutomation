package GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

public class NonBDD_style {
    RequestSpecification R;
    Response Res;
    ValidatableResponse V;

    @Test
    public void Get()
{String Pincode="560066";
R=RestAssured.given();
R.baseUri("https://api.zippopotam.us/");
R.basePath("/IN/"+Pincode);

//When
Res= R.when().log().all().get();
    System.out.println(Res.asString());
//Then
V=Res.then().log().all();
V.statusCode(200);

}
}