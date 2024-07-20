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
                .header("Authorization", "Bearer 11a784aacb967ef537317a1e0f4a9a2976d7033069eac7a424021593dbc97176");
    }

    public static Response getListUsers(String endpoint){
        setupHeaders();
        return request.when().get(endpoint);
    }
}
