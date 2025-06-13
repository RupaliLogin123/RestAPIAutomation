package EX01;

import io.restassured.RestAssured;

import java.util.Scanner;

public class Lab002 {
    public static void main(String[] args) {

        System.out.println("Enter a Pincode");
        Scanner Sc=new Scanner(System.in);
        String pincode=Sc.next();
        RestAssured.given().baseUri("https://api.zippopotam.us").basePath("/IN/" + pincode)
                .when().get()
                .then().log().all().statusCode(200);
    }
}
