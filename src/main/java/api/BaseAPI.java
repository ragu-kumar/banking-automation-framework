package api;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class BaseAPI {

    public static RequestSpecification request() {
        return RestAssured.given()
                .header("Content-Type", "application/json");
    }
}