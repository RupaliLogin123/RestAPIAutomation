package EX002;

import io.restassured.RestAssured;

public class Lab005_MultipleTc {
    public static void main(String[] args) {
        String pincode="110048";
        RestAssured.given().baseUri("https://api.zippopotam.us").basePath("/IN/"+pincode)
                .when().get()
                .then().log().all().statusCode(200);

        pincode="@";
        RestAssured.given().baseUri("https://api.zippopotam.us").basePath("/IN/"+pincode)
                .when().get()
                .then().log().all().statusCode(200);


        pincode="637788";
        RestAssured.given().baseUri("https://api.zippopotam.us").basePath("/IN/"+pincode)
                .when().get()
                .then().log().all().statusCode(200);


    }
}
