package helper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Models {

    private static RequestSpecification request;

    public static void setupHeaders(){
        request = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("Authorization", "Bearer e3e45819577727d4cf41d895423607c030916c945a2ae1858b38434e018ec120");
    }

    public static Response getListUsers(String endpoint){
        setupHeaders();
        return request.when().get(endpoint);
    }

    public static Response createNewUser(String endpoint){
        setupHeaders();
        return request.when().post(endpoint);
    }

}
