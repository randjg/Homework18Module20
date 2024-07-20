package pages;

import helper.Endpoint;
import helper.Utility;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;

import java.io.File;
import java.util.List;
import java.util.Objects;

import static helper.Models.getListUsers;
import static org.assertj.core.api.Assertions.assertThat;

public class ApiPage {

    String setURL;
    Response response;

    public void prepareURLFor(String url){
        switch (url) {
            case "GET_LIST_USERS":
                setURL = Endpoint.GET_LIST_USERS;
                break;
            case "CREATE_NEW_USERS":
                setURL = Endpoint.CREATE_NEW_USERS;
                break;
            case "DELETE_USERS":
                setURL = Endpoint.DELETE_USERS;
                break;

            default:
                System.out.println("Input the right URL");
        }
    }

    public void hitApiGetListUsers() {
        response = getListUsers(setURL);
        System.out.println(response.getBody().asString());
    }

    public void validationStatusCodeIsEqualsTo(int status_code) {
        assertThat(response.statusCode()).isEqualTo(status_code);
    }

    public void validationResponseBodyGetListUsers() {
        List<Object> id = response.jsonPath().getList("id");
        List<Object> name = response.jsonPath().getList("name");
        List<Object> email = response.jsonPath().getList("email");
        List<Object> gender = response.jsonPath().getList("gender");
        List<Object> status = response.jsonPath().getList("status");

        assertThat(id.get(0)).isNotNull();
        assertThat(name.get(0)).isNotNull();
        assertThat(email.get(0)).isNotNull();
        assertThat(gender.get(0)).isIn("male", "female");
        assertThat(status.get(0)).isIn("active", "inactive");
    }

    public void validationResponseJsonWithJSONSchema(String filename) {
        File JSONFile = Utility.getJSONSchemaFile(filename);
        response.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JSONFile));
    }
}
